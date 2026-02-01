class Student {
    String id;
    String name;
    int birthYear;
    double gpa;

    Student(String id, String name, int birthYear, double gpa) {
        this.id = id;
        this.name = name;
        this.birthYear = birthYear;
        this.gpa = gpa;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Birth Year: " + birthYear);
        System.out.println("GPA: " + gpa);
        System.out.println();
    }
}

public class Bai1 {
    public static void main(String[] args) {
        Student s1 = new Student("SV001", "Nguyen Van A", 2003, 3.2);
        Student s2 = new Student("SV002", "Tran Thi B", 2004, 3.6);

        s1.display();
        s2.display();
    }
}
