package Bai1;
public class Student extends Person {
    private String studentId;
    private double gpa;
    public Student() {
        super();
        studentId = "";
        gpa = 0.0;
    }
    public Student(String fullName, int age, String studentId, double gpa) {
        super(fullName, age);
        this.studentId = studentId;
        this.gpa = gpa;
    }
    public void displayStudent() {
        display();
        System.out.println("Mã sinh viên: " + studentId);
        System.out.println("Điểm trung bình: " + gpa);
    }
}
