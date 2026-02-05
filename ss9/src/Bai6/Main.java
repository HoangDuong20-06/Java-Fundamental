package Bai6;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];

        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(3, 4);
        shapes[2] = new Rectangle(6);

        double total = 0;

        for (Shape s : shapes) {
            double area = s.calculateArea();
            System.out.println("Diện tích: " + area);
            total += area;
        }

        System.out.println("=> Tổng diện tích: " + total);
    }
}