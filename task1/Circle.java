package task1;

import java.util.Date;

public class Circle extends Shape {
    private double radius;

    public Circle() {
        super("Green", false);
        this.radius = 1.0;
        getDateCreated();
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
        getDateCreated();
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimiter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return super.toString() + ", Radius: " + radius;
    }

    @Override
    public String getType() {
        return "Circle";
    }
}