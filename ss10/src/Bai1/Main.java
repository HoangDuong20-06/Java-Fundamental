package Bai1;

public class Main {
    public static void main(String[] args) {
        Shape c = new Circle(5);
        Shape r = new Rectangle(4, 6);

        System.out.println("Circle area: " + c.getArea());
        System.out.println("Circle perimeter: " + c.getPerimeter());

        System.out.println("Rectangle area: " + r.getArea());
        System.out.println("Rectangle perimeter: " + r.getPerimeter());
    }
}
