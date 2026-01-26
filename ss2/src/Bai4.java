import java.util.Scanner;
public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idBook;
        do {
            System.out.print("Nhap ma ID sach moi: ");
            idBook = sc.nextInt();
            if (idBook <= 0) {
                System.out.println("Loi: ID phai la so duong. Moi nhap lai!");
            }
        }while (idBook <= 0);
            System.out.printf("Xac nhan: Ma %d da duoc ghi nhan", idBook);
    }
}
