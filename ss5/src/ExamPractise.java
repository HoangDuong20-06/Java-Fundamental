import java.util.Arrays;
import java.util.Scanner;
public class ExamPractise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        String[] Infor = {
                "B2412367",
                "B2412349",
                "B1238079"
        };
        do{
            // MENU
            System.out.println("\n=== MENU ===");
            System.out.println("1.Hiển thị danh sách MSSV");
            System.out.println("2.Thêm mới MSSV");
            System.out.println("3.Cập nhật MSSV");
            System.out.println("4.Xóa MSSV");
            System.out.println("5.Tìm kiếm MSSV");
            System.out.println("6.Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = sc.nextInt();
            switch (choice){
                // Hiển thị danh sách MSSV
                case 1:
                    System.out.println(Arrays.toString(Infor));
                    break;
                // Thêm mới MSSV
                case 2:
                    System.out.print("Nhập MSSV");
                    String MSSV = sc.nextLine();
                    break;
                // Cập nhật MSSV
                case 3:
                    System.out.print("Nhập MSSV cần cập nhật: ");
                    break;
                // Xóa MSSV
                case 4:
                    System.out.print("Nhâp MSSV muốn xóa: ");
                    String MSSVD = sc.nextLine();
                    int pos = -1;
                    for(int i = 0;i<;i++){

                    }
                    break;
                // Tìm kiếm MSSV
                case 5:
                    System.out.print("Nhập MSSV muốn tìm kiếm: ");
                    break;
                // Thoát chuong trình
                case 6:
                    System.out.print("Kết thúc chuong trình");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ");
            }
        }while (choice != 6);
    }
}
