package zabawa.graTomasza;

import java.awt.*;

public abstract class Enemy {
    private int x;
    private int y;
    private int width ;
    private int height ;
    private Color color;
    private Rectangle hitBox;


    public Enemy(int x,int y,int width,int height,Color color)
    {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
        hitBox = new Rectangle(x,y,width,height);
    }

    public void update(){
        hitBox = new Rectangle(x,y,width,height);
    }

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

    public Rectangle getHitBox() {
        return hitBox;
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

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
