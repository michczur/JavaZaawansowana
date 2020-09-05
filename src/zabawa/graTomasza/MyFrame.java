package zabawa.graTomasza;

import javax.swing.*;

public class MyFrame extends JFrame {
    int width = 240;
    int height = 240;
    MainGameClass mainGameClass = new MainGameClass();

    public MyFrame(){
        this.setSize(width,height);
        this.add(mainGameClass);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    public MyFrame(int width,int height)
    {
        this.width = width;
        this.height = height;
        this.setSize(width,height);
        this.add(mainGameClass);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
