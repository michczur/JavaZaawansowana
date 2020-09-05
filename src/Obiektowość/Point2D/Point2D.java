package Obiektowość.Point2D;

public class Point2D {
    private float x;
    private float y;
    private float[] tab = new float[2];

    public Point2D() {
        x = 0;
        y = 0;
    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float[] getXY() {
        tab[0]=this.x;
        tab[1]=this.y;
        return tab;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public String toString() {
        return "(" + x + ", " + y + ')';
    }
}