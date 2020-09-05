package zabawa.graTomasza;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Random;

public class MainGameClass extends JPanel implements ActionListener, KeyListener {
    // Timer robiący za pętle gry
    private Timer gameLoopTimer;
    // lista przeciwników
    private ArrayList<Enemy> enemyList = new ArrayList<>();
    // inicjuje gracza
    private Player player = new Player(220, 220, 30, 30, 5);
    // other stuff
    private int score = 0;
    private int waveNumber = 1;
    // bullet stuff
    private ArrayList<Bullet> bullets = new ArrayList();
    private String bulletDirection = "up";

    public MainGameClass() {
        // inicjuje pętle gry
        gameLoopTimer = new Timer(31, this); // 1sec = 1000ms / 30 = ~33 to daje ~30 FPS
        // dodaje metode do czytania klawiszy
        addKeyListener(this);
        // focus potrzebny by czytało klawisze
        setFocusable(true);
        // start pętli gry
        gameLoopTimer.start();
        // spawnuje przeciwników
        spawnEnemies();
    }

    public void spawnEnemies() {
        Random random = new Random();
        int spawnCount = waveNumber + 2;
        // spawnuje przeciwników
        for (int i = 0; i < spawnCount; i++) {
            // losuje x i y i rodzaj przeciwnika
            int x = random.nextInt(8);
            int y = random.nextInt(8);
            int enemyType = random.nextInt(3);
            if (enemyType == 0) {
                enemyList.add(new BlueEnemy(x * 55, (y * 55) + 25, 40, 40, Color.BLUE));
            } else if (enemyType == 1) {
                enemyList.add(new RedEnemy(x * 55, (y * 55) + 25, 35, 35, Color.RED));
            } else if (enemyType == 2) {
                enemyList.add(new BigEnemy(x * 55, (y * 55) + 25, 66, 66, Color.BLACK));
            }
        }
    }

    public void gameUpdate() {
        // update player
        player.update();
        // update enemies
        for (int i = 0; i < enemyList.size(); i++) {
            enemyList.get(i).update();
        }
        // sprawdzam kolizje
        for (int i = 0; i < enemyList.size(); i++) {
            for (int j = 0; j < bullets.size() ; j++) {
                if(bullets.size() > 0 && enemyList.size() > 0) {
                    if (bullets.get(j).getHitBox().intersects(enemyList.get(i).getHitBox())) {
                        // usówa trafionego przeciwnika i dodaje 1 punkt
                        enemyList.remove(i);
                        bullets.remove(j);
                        score++;
                    }
                }
            }
        }

        // jesli nie ma przeciwników,spawnuje nowych
        if (enemyList.isEmpty()) {
            waveNumber++;
            if(bullets.size() > 0){
                bullets.clear();
            }
            spawnEnemies();
        }
        // update bullets
        for (int i = 0; i < bullets.size(); i++) {
            bullets.get(i).update();
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        // potrzebny stuff by dało się wyswietlac
        super.paintComponent(g);
        Graphics2D g2D = (Graphics2D) g;
        ///////////
        this.setBackground(Color.WHITE);
        ///////////
        // rysuje przeciwników

        for (int i = 0; i < enemyList.size(); i++) {
            g2D.setColor(enemyList.get(i).getColor());
            g2D.fillRect(enemyList.get(i).getX(), enemyList.get(i).getY(), enemyList.get(i).getWidth(), enemyList.get(i).getHeight());
        }
        // rysuje gracza i jego hitbox
        g2D.setColor(Color.GREEN);
        g2D.fillOval(player.getX(), player.getY(), player.getWidth(), player.getHeight());
        g2D.setColor(Color.GREEN);
        g2D.drawRect((int) player.getHitBox().getX(), (int) player.getHitBox().getY(), (int) player.getHitBox().getWidth(), (int) player.getHitBox().getHeight());

        // draw bullets
        g2D.setColor(Color.BLACK);
        for (int i = 0; i < bullets.size(); i++) {
            g2D.fillOval(bullets.get(i).getX(),bullets.get(i).getY(),10,10);
        }

        // draw "hud" :P
        g2D.setColor(Color.BLACK);
        g2D.setStroke(new BasicStroke(25));
        g2D.drawLine(0, 12, 500, 12);
        g2D.setColor(Color.WHITE);
        g2D.setFont(new Font("Courier New", Font.ITALIC, 20));
        g2D.drawString("Score: " + score + "     wave: " + waveNumber, 10, 16);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // to metoda od Timer'a działająca jako pętla gry i aktualizuje gre/rysuje stuff
        gameUpdate();
        repaint();
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // metoda od KeyListener'a umożliwiająca zczytywanie klawiszy
        if (e.getKeyCode() == KeyEvent.VK_W) {
            player.setUp(true);
            bulletDirection = "up";
        }
        if (e.getKeyCode() == KeyEvent.VK_S) {
            player.setDown(true);
            bulletDirection = "down";
        }
        if (e.getKeyCode() == KeyEvent.VK_A) {
            player.setLeft(true);
            bulletDirection = "left";
        }
        if (e.getKeyCode() == KeyEvent.VK_D) {
            player.setRight(true);
            bulletDirection = "right";
        }
        if (e.getKeyCode() == KeyEvent.VK_SPACE) {
            switch (bulletDirection) {
                case "up":
                    bullets.add(new Bullet(player.getX(),player.getY(),0,-10));
                    break;
                case "down":
                    bullets.add(new Bullet(player.getX(),player.getY(),0,10));
                    break;
                case "left":
                    bullets.add(new Bullet(player.getX(),player.getY(),-10,0));
                    break;
                case "right":
                    bullets.add(new Bullet(player.getX(),player.getY(),10,0));
                    break;
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_W) {
            player.setUp(false);
        }
        if (e.getKeyCode() == KeyEvent.VK_S) {
            player.setDown(false);
        }
        if (e.getKeyCode() == KeyEvent.VK_A) {
            player.setLeft(false);
        }
        if (e.getKeyCode() == KeyEvent.VK_D) {
            player.setRight(false);
        }
    }
}
