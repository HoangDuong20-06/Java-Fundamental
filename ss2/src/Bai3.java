import java.util.Scanner;
public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so ngay tra muon: ");
        int day = sc.nextInt();
        int total = 0;
        for(int i = 0 ;i<day;i++){
            System.out.printf("Nhap so ngay tre cua cuon thu %d: ", i+1);
            int deadline = sc.nextInt();
            total += deadline * 5000;
        }
        System.out.printf("===> Tong tien phat: %d VND", total);
    }
}
