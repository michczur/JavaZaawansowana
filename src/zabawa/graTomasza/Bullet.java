package zabawa.graTomasza;

import java.awt.*;

public class Bullet {

    private int x;
    private int y;
    private int xDir;
    private int yDir;
    private Rectangle hitBox;

    public Bullet(int x,int y,int xDir,int yDir){
        this.x = x;
        this.y = y;
        this.xDir = xDir;
        this.yDir = yDir;
        hitBox = new Rectangle(x, y, 10, 10);
    }

    public void update()
    {
        x += xDir;
        y += yDir;
        hitBox = new Rectangle(x, y, 10, 10);
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

    public int getxDir() {
        return xDir;
    }

    public void setxDir(int xDir) {
        this.xDir = xDir;
    }

    public int getyDir() {
        return yDir;
    }

    public void setyDir(int yDir) {
        this.yDir = yDir;
    }

    public Rectangle getHitBox() {
        return hitBox;
    }

    public void setHitBox(Rectangle hitBox) {
        this.hitBox = hitBox;
    }
}
