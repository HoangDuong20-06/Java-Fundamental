import java.util.Scanner;
public class Bai1 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.print("Nhap so tuoi cua ban: ");
       int age = sc.nextInt();
       System.out.print("Nhap so sach muon: ");
       int total = sc.nextInt();

       if (age >= 18 && total <= 3){
           System.out.println("Ket qua: Ban du dieu kien muon sach quy hiem");
        } else if (age >=18 && total > 3) {
           System.out.println("Ket qua: Ban khong ddu dieu kien");
           System.out.println("- Ly do: Ban da muon toi da 3 cuon");
       }else {
           System.out.println("Ket qua: Ban khong du dieu kien");
           System.out.println("- Ly do: Ban phai tu 18 tuoi tro len");
       }
    }
}