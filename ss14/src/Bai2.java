import java.util.HashMap;
import java.util.Scanner;
public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> thuoc = new HashMap<>();
        thuoc.put("T01", "Paracetamol");
        thuoc.put("T02", "Ibuprofen");
        thuoc.put("T03", "Aspirin");
        thuoc.put("T04", "Amoxicillin");
        thuoc.put("T05", "Vitamin C");
        System.out.print("Nhập mã thuốc: ");
        String ma = sc.nextLine();
        if (thuoc.containsKey(ma)) {
            System.out.println("Tên thuốc: " + thuoc.get(ma));
        } else {
            System.out.println("Thuốc không tồn tại");
        }
    }
}
