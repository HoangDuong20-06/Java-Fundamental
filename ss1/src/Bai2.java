import  java.util.Scanner;
public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số ngày chậm trả: ");
        int days = sc.nextInt();
        System.out.print("Nhập số lượng sách mượn: ");
        int books = sc.nextInt();
        int baseFee = days * books * 5000;
        double finalFee = baseFee;
        if (days > 7 && books >= 3) {
            finalFee *= 1.2;
        }
        boolean lockCard = finalFee > 50000;
        System.out.println("Tiền phạt gốc: " + baseFee + " VND");
        System.out.println("Tiền phạt sau điều chỉnh: " + finalFee + " VND");
        System.out.println("Yêu cầu khóa thẻ: " + lockCard);
    }
}
