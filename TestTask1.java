import task1.*;
import java.util.Random;
public class TestTask1 {
    public static void main(String[] args){
        Shape[] shapes=new Shape[5];
        Random random=new Random();

        for (int i=0;i<shapes.length;i++){
            int choice=random.nextInt(3);
            switch (choice){
                case 0:
                    shapes[i]=new Shape("Blue",true);
                    break;
                case 1:
                    shapes[i]=new Circle("Red",false,5.0);
                    break;
                case 2:
                    shapes[i]=new Rectangle(4,6,"Yellow",true);
                    break;
            }
        }
        for(Shape s:shapes) {
            System.out.println(s.getType());

            if (s instanceof Circle) {
                Circle c = (Circle) s;
                System.out.println(c.getArea());
            } else if (s instanceof Rectangle) {
                Rectangle r = (Rectangle) s;
                System.out.println(r.getPerimiter());
            } else {
                System.out.println(s.getColor());
            }
            System.out.println(s.toString() + "\n");
        }
    }
}