package task1;

public class Rectangle extends Shape{
    private double height;
    private double width;

    public Rectangle(){
        super("Black",false);
        getDateCreated();
    }
    public Rectangle(double height,double width,String color,boolean filled){
        this.height=height;
        this.width=width;
        super(color,filled);
        getDateCreated();
    }

    public double getArea(){return height*width;}

    public double getPerimiter(){return 2*(height+width);}

    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                ", width=" + width +
                '}';
    }

    @Override
    public String getType() {
        return "Rectangle";
    }

}
