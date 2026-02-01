class Book {
    String id;
    String title;
    String author;
    int year;
    double price;

    Book(String id, String title, String author, int year, double price) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.year = year;
        this.price = price;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year: " + year);
        System.out.println("Price: " + price);
        System.out.println();
    }
}

public class Bai5 {
    public static void main(String[] args) {
        Book b = new Book("B01", "Java OOP", "Nguyen Van C", 2024, 250);
        b.display();
    }
}
