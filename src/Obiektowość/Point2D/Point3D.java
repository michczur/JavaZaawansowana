package Obiektowość.Point2D;

import java.util.Arrays;

public class Point3D extends Point2D {
    private float z;
    private float[] tab = new float[3];

    public Point3D() {
        setX(0);
        setY(0);
        z = 0;
    }

    public Point3D(float x, float y, float z) {
        setX(x);
        setY(y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float[] getXYZ() {

        tab[0]=getX();
        tab[1]=getY();
        tab[2] = this.z;
        return tab;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "z=" + z +
                ", tab=" + Arrays.toString(tab) +
                '}';
    }
}
