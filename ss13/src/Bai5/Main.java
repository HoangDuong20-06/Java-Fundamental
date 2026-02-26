package Bai5;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Collections;

public class Main {
    static ArrayList<Patient> list = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Tiếp nhận bệnh nhân");
            System.out.println("2. Cập nhật chẩn đoán");
            System.out.println("3. Xuất viện");
            System.out.println("4. Sắp xếp danh sách bệnh nhân");
            System.out.println("5. Hiển thị danh sách bệnh nhân");
            System.out.println("6. Thoát");
            System.out.print("Chọn chức năng: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    addPatient();
                    break;
                case 2:
                    updateDiagnosis();
                    break;
                case 3:
                    dischargePatient();
                    break;
                case 4:
                    sortPatients();
                    break;
                case 5:
                    showPatients();
                    break;
                case 6:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Chức năng không hợp lệ!");
            }

        } while (choice != 6);
    }
    static void addPatient() {
        System.out.print("Nhập ID bệnh nhân: ");
        String id = sc.nextLine();
        for (Patient p : list) {
            if (p.getId().equals(id)) {
                System.out.println("ID đã tồn tại!");
                return;
            }
        }
        System.out.print("Nhập tên bệnh nhân: ");
        String name = sc.nextLine();
        System.out.print("Nhập tuổi: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhập chẩn đoán: ");
        String diagnosis = sc.nextLine();
        list.add(new Patient(id, name, age, diagnosis));
        System.out.println("Bệnh nhân đã đuược thêm thành công.");
    }
    static void updateDiagnosis() {
        System.out.print("Nhập ID bệnh nhân để cập nhật chuẩn đoán: ");
        String id = sc.nextLine();
        for (Patient p : list) {
            if (p.getId().equals(id)) {
                System.out.print("Nhập chẩn đoán mới: ");
                String newDiagnosis = sc.nextLine();
                p.setDiagnosis(newDiagnosis);
                System.out.println("Chuẩn đoán đã được cập nhật.");
                return;
            }
        }

        System.out.println("Không tìm thấy bệnh nhân.");
    }
    static void dischargePatient() {
        System.out.print("Nhập ID bệnh nhân cần xuất viện: ");
        String id = sc.nextLine();

        Iterator<Patient> iterator = list.iterator();
        while (iterator.hasNext()) {
            Patient p = iterator.next();
            if (p.getId().equals(id)) {
                iterator.remove();
                System.out.println("Xuất viện thành công.");
                return;
            }
        }

        System.out.println("Không tìm thấy bệnh nhân với ID đã cho.");
    }
    static void sortPatients() {
        Collections.sort(list, new Comparator<Patient>() {
            @Override
            public int compare(Patient p1, Patient p2) {
                if (p2.getAge() != p1.getAge()) {
                    return p2.getAge() - p1.getAge();
                }
                return p1.getFullName().compareToIgnoreCase(p2.getFullName());
            }
        });

        System.out.println("Đã sắp xếp danh sách.");
    }

    static void showPatients() {
        if (list.isEmpty()) {
            System.out.println("Danh sách trống.");
            return;
        }

        for (Patient p : list) {
            System.out.println(p);
        }
    }
}