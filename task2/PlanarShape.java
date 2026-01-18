package task2;

import task1.Shape;

public abstract class PlanarShape extends Shape {
    protected double x;
    protected double y;

    public PlanarShape(){
        this.x= 0.0;
        this.y= 0.0;
    }

    public PlanarShape(String color, boolean filled, double x, double y){
        super(color, filled);
        this.x = x;
        this.y = y;
    }

    public double getX() { return x; }
    public void setX(double x) { this.x = x; }
    public double getY() { return y; }
    public void setY(double y) { this.y = y; }

    @Override
    public String toString() {
        return "PlanarShape{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public abstract double getArea();

    public abstract double getPerimiter();

    @Override
    public String getType(){
        return "PlanarShape";
    };
}
