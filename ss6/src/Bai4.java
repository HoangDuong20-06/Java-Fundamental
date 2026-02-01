class Employee {
    String id;
    String name;
    double salary;

    Employee() {
        id = "Unknown";
        name = "Unknown";
        salary = 0;
    }

    Employee(String id, String name) {
        this.id = id;
        this.name = name;
        salary = 0;
    }

    Employee(String id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println();
    }
}

public class Bai4 {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee("E01", "Nam");
        Employee e3 = new Employee("E02", "Hoa", 1200);

        e1.display();
        e2.display();
        e3.display();
    }
}
