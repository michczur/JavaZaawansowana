package zabawa.graTomasza;

import java.awt.*;

public class Player {
    // zmienne
    private int x;
    private int y;
    private int width;
    private int height;
    private int playerSpeed;
    private boolean left;
    private boolean right;
    private boolean up;
    private boolean down;
    Object o;

    private Rectangle hitBox;

    // konstruktor
    public Player(int x, int y, int width, int height, int playerSpeed) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.playerSpeed = playerSpeed;
        // bazowy hitbox
        hitBox = new Rectangle(x, y, width, height);
        o = up;
        if(o.equals(down)){
            System.out.println("A");}
        else System.out.println("B");
    }

    // aktualizuje pozycje hitBoxa i poruszam graczem
    public void update() {
        if (up) {
            y += -playerSpeed;
        }
        if (down) {
            y += playerSpeed;
        }
        if (left) {
            x += -playerSpeed;
        }
        if (right) {
            x += playerSpeed;
        }
        hitBox = new Rectangle(x, y, width, height);
    }
    // getters & setters

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Rectangle getHitBox() {
        return hitBox;
    }

    public void setHitBox(Rectangle hitBox) {
        this.hitBox = hitBox;
    }

    public int getPlayerSpeed() {
        return playerSpeed;
    }

    public void setPlayerSpeed(int playerSpeed) {
        this.playerSpeed = playerSpeed;
    }

    public boolean isLeft() {
        return left;
    }

    public void setLeft(boolean left) {
        this.left = left;
    }

    public boolean isRight() {
        return right;
    }

    public void setRight(boolean right) {
        this.right = right;
    }

    public boolean isUp() {
        return up;
    }

    public void setUp(boolean up) {
        this.up = up;
    }

    public boolean isDown() {
        return down;
    }

    public void setDown(boolean down) {
        this.down = down;
    }
}
