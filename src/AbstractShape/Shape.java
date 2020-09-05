package AbstractShape;

abstract public class Shape {
    protected String color;
    protected boolean isFilled;

    public Shape() {
        color = "unknown";
        isFilled = false;
    }

    public Shape(String color, boolean isFilled) {
        this.color = color;
        this.isFilled = isFilled;
    }

    abstract double getArea();
    abstract double getPerimeter();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return isFilled;
    }

    public void setFilled(boolean filled) {
        isFilled = filled;
    }

    @Override
    public String toString() {
        String wypelnienie;
        if (isFilled == true) {
            wypelnienie = "filled";
        } else {
            wypelnienie = "not filled";
        }
        return "Obiektowość.Shape with color of " + color + wypelnienie;
    }
}
