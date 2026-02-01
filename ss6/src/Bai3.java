class Product {
    private String id;
    private String name;
    private double price;

    Product(String id, String name, double price) {
        this.id = id;
        this.name = name;
        setPrice(price);
    }

    void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        }
    }

    double getPrice() {
        return price;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println();
    }
}

public class Bai3 {
    public static void main(String[] args) {
        Product p = new Product("P01", "Laptop", 1500);
        p.display();
        p.setPrice(-100);
        p.display();
    }
}
