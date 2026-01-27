import java.util.Scanner;
public class Bai2 {
    public static int searchBooks(String[] arr, String search){
        for(int i = 0;i<arr.length;i++){
            if(arr[i].equalsIgnoreCase(search)){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String[] books = {
                "Lap trinh Java",
                "Cau truc du lieu",
                "Co so du lieu",
                "Mang may tinh",
                "Cong nghe phan mem"
        };
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten sach can tim: ");
        String search = sc.nextLine();
        int result = searchBooks(books,search);
        if(result != -1){
            System.out.print("Tim thay sach tai vi tri: "+ result);
        }else {
            System.out.print("Khong tim thay sach trong thu vien");
        }
    }
}
