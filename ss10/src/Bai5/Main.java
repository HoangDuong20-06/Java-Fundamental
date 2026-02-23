package Bai5;

public class Main {
    public static void main(String[] args) {
        Employee staff = new OfficeStaff("Nhân viên A", 8000);
        Employee manager = new Manager("Quản lý B", 15000);
        System.out.println("Lương " + staff.getName() + ": " + staff.calculateSalary());
        System.out.println("Lương " + manager.getName() + ": " + manager.calculateSalary());
    }
}
