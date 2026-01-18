package task2;

public class Circle extends PlanarShape {
    protected double radius;

    public Circle(){
        super("black", false, 0, 0);
        this.radius=1.0;
    }

    public Circle(double x,double y,double radius,String color,boolean filled){
        super(color,filled, x, y);
        this.radius=radius;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }

    @Override
    public double getPerimiter() {
        return 2*Math.PI*radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    @Override
    public String getType() {
        return super.getType();
    }
}
