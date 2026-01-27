import java.util.Scanner;
public class Bai1 {
    public static int[] addBookToLibraries(int n){
        Scanner sc = new Scanner(System.in);
        int[] books = new int[n];

        for(int i =0;i<n;i++){
            System.out.print("Nhap ma sach thu "+ (i+1) + ": ");
            books[i] = sc.nextInt();
        }
        return books;
    }

    public static void displayLibraries(int[] arr) {
        System.out.print("Danh sach ma sach: ");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
            if(i< arr.length-1){
                System.out.print(", ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong sach: ");
        int totalBook = sc.nextInt();
        System.out.println("Nhap ma so cho "+ totalBook+ " cuon sach: ");
        int[] bookList = addBookToLibraries(totalBook);
        displayLibraries(bookList);
    }
}