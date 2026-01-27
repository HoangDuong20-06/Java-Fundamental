import java.util.Scanner;
public class Bai5 {
    public static int deleteBook(int[] arr, int n, int bookId){
        int pos = -1;
        for(int i=0;i<n;i++){
            if(arr[i]==bookId){
                pos = i;
                break;
            }
        }
        if (pos == -1){
            System.out.println("Khong tim thay ma sach: "+bookId);
            return n;
        }
        for (int i = pos;i<n-1;i++){
            arr[i]=arr[i+1];
        }
        System.out.println("Da xoa sach co ma: "+bookId);
        return n-1;
    }
    public static void displayBooks( int[] arr, int n){
        if (n==0){
            System.out.println("Danh sach rong!");
            return;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] books = {101,202,303,404,505,606};
        int n =6;
        while (n>0){
            System.out.println("\nDanh sach hien tai");
            displayBooks(books, n);
            System.out.print("Nhap ma sach can xoa: ");
            int bookId = sc.nextInt();
            n = deleteBook(books,n,bookId);
            System.out.print("Tiep tuc xoa ? (1-Co / 0-Khong): ");
            int choice = sc.nextInt();
            if (choice == 0){
                break;
            }
        }
        System.out.print("Chuong trinh ket thuc");
    }
}
