package task1;

import java.util.Date;

public class Shape {
    private String color;
    private boolean filled;
    private Date dateCreated;

    public Shape(){
        this.filled=false;
        this.color="Black";
        this.dateCreated=new Date();
    }

    public Shape(String color,boolean filled ){
        this.filled=filled;
        this.color=color;
        this.dateCreated=new Date();
    }

    public void setFilled() {
        this.filled = filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean getFilled() {
        return filled;
    }

    public String getColor() {
        return color;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                ", dateCreated=" + dateCreated +
                '}';
    }

    public String getType(){return "Shape";}
}
