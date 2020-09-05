package zabawa.Okienko;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Okienko {
    protected boolean someFlag = false;
    JFrame frame = new JFrame();
    JTextField textField = new JTextField();
    JTextField textField2 = new JTextField();
    JButton button1 = new JButton("Button nr 1 :)");
    JButton button2 = new JButton("Random ME!~~");

    public static void main(String[] args) {
        new Okienko();
    }

    public Okienko() {
        frame.add(button1);
        frame.add(button2);
        frame.add(textField);
        frame.add(textField2);
        frame.setTitle("Okienko ;)");
        frame.setVisible(true);
        frame.setSize(800, 400);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(null);
        Font font = new Font("PLAIN", Font.PLAIN, 30);
        textField.setBounds(100, 200, 400, 50);
        textField.setFont(font);
        textField.setForeground(Color.CYAN);
        textField.setText("Sample text");
        textField2.setVisible(false);
        textField2.setBounds(150, 300, 300, 50);
        textField2.setFont(font);
        textField2.setForeground(Color.RED);
        textField2.setText("WOOOOHOOO~~");
        font = new Font("Arial Bold", Font.ITALIC, 25);
        button2.setBounds(200, 100, 200, 75);
        button2.setEnabled(false);
        button2.setVisible(false);
        button1.setFont(font);
        button1.setBounds(200, 100, 200, 50);
        button1.addActionListener(e -> {
            button1.setEnabled(false);
            button1.setVisible(false);
            textField.setForeground(Color.GREEN);
            textField.setText("Hello buttons :D");
            textField2.setVisible(true);
            button2.setEnabled(true);
            button2.setVisible(true);
        });
        button2.addActionListener(e -> {
            disableStuff();
            randomME();
        });
    }

    private void disableStuff() {
        if (!someFlag) {
            textField.setEnabled(false);
            textField.setVisible(false);
            textField2.setBounds(150, 200, 300, 50);
            textField2.setForeground(Color.BLUE);
            someFlag = true;
        }
    }

    private void randomME() {
        Random random = new Random();
        int randomInt;
        StringBuilder randomGibberishText = new StringBuilder();
        char randomCharFromNumber;
        for (int i = 0; i < 10; i++) {
            do {
                randomInt = random.nextInt(128);
            } while (randomInt <= 32);
            randomCharFromNumber = (char) randomInt;
            randomGibberishText.append(randomCharFromNumber);
        }
        textField2.setText(randomGibberishText + "   ? :)");
    }
}

