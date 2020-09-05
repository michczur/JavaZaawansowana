package AbstractShape;

public class Circle extends Shape {
    private int radius;

    public Circle() {
        setColor("unknown");
        setFilled(false);
        radius = 1;
    }

    @Override
    double getArea() {
        return Math.PI*(radius*radius);
    }

    @Override
    double getPerimeter() {
        return 2*Math.PI*radius;
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
    private String krztałt = toString();

    @Override
    public String toString() {
       return "Circle with radius= " + radius +
                "which is sumclass of "+ krztałt;
    }
}
