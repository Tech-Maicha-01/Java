import Area.Rectangle;
import Area.Circle;
import Area.Square;

public class lab14 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(10, 5);
        Circle c = new Circle(7);
        Square s = new Square(4);

        System.out.println("Area of Rectangle: " + r.getArea());
        System.out.printf("Area of Circle: %.3f\n",c.getArea());
        System.out.println("Area of Square: " + s.getArea());
    }
}
