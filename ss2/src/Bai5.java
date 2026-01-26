import java.util.Scanner;
public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int point = 100;
        int day;
        while (true){
            System.out.println("--HE THONG DANH GIA DOC GIA--");
            System.out.println("(Nhap so ngay tre. Nhap 999 de ket thuc)");
            System.out.print("So ngay tre cua lan nay: ");
            day = sc.nextInt();
            if(day == 999){
                break;
            }
            if (day > 0){
                point -= (day*2);
            }else {
                point += 5;
            }
        }
        System.out.printf("Tong diem uy tin: %d\n",point);
        if(point > 120){
            System.out.print("Xep loai: Độc giả Thân thiết");
        } else if (point >=80 || point <= 120) {
            System.out.print("Xep loai: Độc giả Tiêu chuẩn");
        }else {
            System.out.print("Xep loai: Độc giả cần lưu ý");
        }
    }
}
