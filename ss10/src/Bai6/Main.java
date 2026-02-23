package Bai6;
import java.util.*;
public class Main {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("Laptop", 1500));
        list.add(new Product("Phone", 800));
        list.add(new Product("Tablet", 1000));
        list.sort(new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                return Double.compare(p1.price, p2.price);
            }
        });
        System.out.println("Theo giá:");
        for (Product p : list) {
            System.out.println(p.name + " - " + p.price);
        }
        list.sort((p1, p2) -> p1.name.compareTo(p2.name));
        System.out.println("\nTheo tên:");
        for (Product p : list) {
            System.out.println(p.name + " - " + p.price);
        }
    }
}