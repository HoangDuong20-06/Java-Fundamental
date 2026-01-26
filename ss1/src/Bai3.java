public class Bai3 {
    public static void main(String[] args) {
        String book1 = "Java Basic";
        String book2 = "Python Intro";

        System.out.println("Trước khi hoán đổi:");
        System.out.println("Book1: " + book1 + ", Book2: " + book2);

        book1 = book1 + book2;
        book2 = book1.substring(0, book1.length() - book2.length());
        book1 = book1.substring(book2.length());

        System.out.println("Sau khi hoán đổi:");
        System.out.println("Book1: " + book1 + ", Book2: " + book2);
    }
}
