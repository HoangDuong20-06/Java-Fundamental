import java.util.Arrays;
import java.util.Scanner;

public class ExamPractise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] infor = {
                "B2412367",
                "B2412349",
                "B1238079"
        };

        int choice;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Hiển thị danh sách MSSV");
            System.out.println("2. Thêm mới MSSV");
            System.out.println("3. Cập nhật MSSV");
            System.out.println("4. Xóa MSSV");
            System.out.println("5. Tìm kiếm MSSV");
            System.out.println("6. Thoát");
            System.out.print("Nhập lựa chọn: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println(Arrays.toString(infor));
                    break;

                case 2:
                    String newMSSV;
                    do {
                        System.out.print("Nhập MSSV mới: ");
                        newMSSV = sc.nextLine();
                    } while (!newMSSV.matches("B\\d{7}"));

                    infor = Arrays.copyOf(infor, infor.length + 1);
                    infor[infor.length - 1] = newMSSV;
                    break;

                case 3:
                    System.out.print("Nhập index cần sửa: ");
                    int index = sc.nextInt();
                    sc.nextLine();

                    if (index < 0 || index >= infor.length) {
                        System.out.println("Index không hợp lệ");
                        break;
                    }

                    String updateMSSV;
                    do {
                        System.out.print("Nhập MSSV mới: ");
                        updateMSSV = sc.nextLine();
                    } while (!updateMSSV.matches("B\\d{7}"));

                    infor[index] = updateMSSV;
                    break;

                case 4:
                    System.out.print("Nhập MSSV muốn xóa: ");
                    String del = sc.nextLine();
                    int pos = -1;

                    for (int i = 0; i < infor.length; i++) {
                        if (infor[i].equals(del)) {
                            pos = i;
                            break;
                        }
                    }

                    if (pos == -1) {
                        System.out.println("Không tìm thấy MSSV");
                    } else {
                        for (int i = pos; i < infor.length - 1; i++) {
                            infor[i] = infor[i + 1];
                        }
                        infor = Arrays.copyOf(infor, infor.length - 1);
                    }
                    break;

                case 5:
                    System.out.print("Nhập chuỗi cần tìm: ");
                    String key = sc.nextLine().toLowerCase();

                    for (String s : infor) {
                        if (s.toLowerCase().contains(key)) {
                            System.out.println(s);
                        }
                    }
                    break;

                case 6:
                    System.out.println("Kết thúc chương trình");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ");
            }

        } while (choice != 6);
    }
}
