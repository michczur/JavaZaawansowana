package Obiektowość.Shape;

public class Rectangle extends Shape {
    private double width;
    private double length;

    public Rectangle() {
        setColor("unknown");
        setFilled(false);
        width = 1;
        length = 1;
    }

    public Rectangle(String color, boolean isFilled, double width, double length) {
        super(color, isFilled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        double a = getLength();
        double b = getWidth();
        return a * b;
    }

    public double gerPerimeter() {
        double a = getLength();
        double b = getWidth();
        return 2 * a + 2 * b;
    }

    @Override
    public String toString() {
        return "Rectangle with width=" + width + " and length=" + length +
                "which is a subclass off " + super.toString();
    }
}
