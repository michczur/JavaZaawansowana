package Obiektowość.Shape;

public class Circle extends Shape {
    private int radius;

    public Circle() {
        setColor("unknown");
        setFilled(false);
        radius = 1;
    }

    public Circle(String color, boolean isFilled, int radius) {
        super(color, isFilled);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }


    @Override
    public String toString() {
        return "Circle with radius= " + radius +
                " which is subclass of " + super.toString();
    }
}
