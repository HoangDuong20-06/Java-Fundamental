package Bai6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static List<Medicine> cart = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int choice;

        do {
            System.out.println("\n========= MENU =========");
            System.out.println("1. Thêm thuốc vào đơn");
            System.out.println("2. Điều chỉnh số lượng");
            System.out.println("3. Xóa thuốc");
            System.out.println("4. In hóa đơn");
            System.out.println("5. Tìm thuốc giá rẻ");
            System.out.println("6. Thoát");
            System.out.print("Chọn: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    addMedicine();
                    break;
                case 2:
                    updateQuantity();
                    break;
                case 3:
                    removeMedicine();
                    break;
                case 4:
                    printInvoice();
                    break;
                case 5:
                    findCheapMedicine();
                    break;
                case 6:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }

        } while (choice != 6);
    }
    static void addMedicine() {
        System.out.print("Nhập mã thuốc: ");
        String id = sc.nextLine();

        for (Medicine m : cart) {
            if (m.getDrugId().equals(id)) {
                System.out.print("Nhập số lượng thêm: ");
                int addQty = sc.nextInt();
                sc.nextLine();
                m.setQuantity(m.getQuantity() + addQty);
                System.out.println("Đã cộng dồn số lượng.");
                return;
            }
        }

        System.out.print("Nhập tên thuốc: ");
        String name = sc.nextLine();

        System.out.print("Nhập đơn giá: ");
        double price = sc.nextDouble();

        System.out.print("Nhập số lượng: ");
        int qty = sc.nextInt();
        sc.nextLine();

        cart.add(new Medicine(id, name, price, qty));
        System.out.println("Thêm thuốc thành công.");
    }
    static void updateQuantity() {
        System.out.print("Nhập mã thuốc: ");
        String id = sc.nextLine();

        for (Medicine m : cart) {
            if (m.getDrugId().equals(id)) {
                System.out.print("Nhập số lượng mới: ");
                int newQty = sc.nextInt();
                sc.nextLine();

                if (newQty == 0) {
                    cart.remove(m);
                    System.out.println("Đã xóa thuốc khỏi đơn.");
                } else {
                    m.setQuantity(newQty);
                    System.out.println("Cập nhật thành công.");
                }
                return;
            }
        }

        System.out.println("Thuốc không tồn tại.");
    }
    static void removeMedicine() {
        System.out.print("Nhập mã thuốc cần xóa: ");
        String id = sc.nextLine();

        for (Medicine m : cart) {
            if (m.getDrugId().equals(id)) {
                cart.remove(m);
                System.out.println("Xóa thành công.");
                return;
            }
        }

        System.out.println("Thuốc không tồn tại.");
    }
    static void printInvoice() {
        if (cart.isEmpty()) {
            System.out.println("Đơn thuốc trống.");
            return;
        }

        double total = 0;

        System.out.println("\nMã\tTên\tĐơn giá\tSL\tThành tiền");

        for (Medicine m : cart) {
            System.out.println(
                    m.getDrugId() + "\t" +
                            m.getDrugName() + "\t" +
                            m.getUnitPrice() + "\t" +
                            m.getQuantity() + "\t" +
                            m.getTotal()
            );
            total += m.getTotal();
        }
        System.out.println("Tổng tiền: " + total + " VNĐ");
        cart.clear();
    }
    static void findCheapMedicine() {
        boolean found = false;

        System.out.println("Danh sách thuốc dưới 50.000:");

        for (Medicine m : cart) {
            if (m.getUnitPrice() < 50000) {
                System.out.println(
                        m.getDrugId() + " - " +
                                m.getDrugName() + " - " +
                                m.getUnitPrice()
                );
                found = true;
            }
        }

        if (!found) {
            System.out.println("Không có thuốc giá rẻ.");
        }
    }
}