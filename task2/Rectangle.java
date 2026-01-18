package task2;

public class Rectangle extends PlanarShape{
    protected double height;
    protected double width;

    public Rectangle(){
        super("blue",false,0,0);
        this.width=1;
        this.height=1;
    }

    public Rectangle(double x,double y,double height,double width,String color,boolean filled){
        super(color,filled,height,width);
        this.height=height;
        this.width=width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getArea() {
        return height*width;
    }

    @Override
    public double getPerimiter() {
        return 2*(height+width);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                ", width=" + width +
                '}';
    }

    @Override
    public String getType() {
        return super.getType();
    }
}
