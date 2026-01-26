import java.util.Scanner;
public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = 0;
        int min = 1000000;
        int total = 0;

        for(int i = 2; i <= 8;i++){
            if (i==8){
                System.out.print("Nhap luot  muon ngay Chu Nhat: ");;
            }else {
                System.out.print("Nhap luot  muon ngay Thu "+ i + ": ");;
            }
            int day = sc.nextInt();
            if (day > max){
                max = day;
            }
            if (day < min){
                min = day;
            }
            total += day;
        }
        double average = (double) total / 7;
        System.out.println("\n--- KET QUA ---");
        System.out.println("Luot muon cao nhat: "+ max);
        System.out.println("Luot muon thap nhat: "+ min);
        System.out.println("Trung binh moi ngay: "+ average);
    }
}
