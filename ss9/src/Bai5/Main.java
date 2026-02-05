package Bai5;

public class Main {
    public static void main(String[] args) {
        Employee[] list = new Employee[3];

        list[0] = new OfficeEmployee("Nguyen Van A (Office)", 10000000);
        list[1] = new ProductionEmployee("Tran Thi B (Production)", 300, 20000);
        list[2] = new ProductionEmployee("Le Van C (Production)", 150, 30000);

        double total = 0;

        for (Employee e : list) {
            double salary = e.calculateSalary();
            System.out.println(e.name + " - Lương: " + salary);
            total += salary;
        }

        System.out.println("=> TỔNG LƯƠNG: " + total);
    }
}
