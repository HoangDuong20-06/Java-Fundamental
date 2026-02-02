class Student {
    String id;
    String name;
    public static int totalStudent = 0;
    public Student(String id, String name){
        this.id = id;
        this.name = name;
        totalStudent++;
    }
    public void display() {
        System.out.println("ID: "+ id);
        System.out.println("Tên sinh viên: "+ name);
    }
}
public class Bai1 {
    public static void main(String[] args) {
        Student s1 = new Student("01", "Hoàng Dương");
        Student s2 = new Student("02", "Xuân Ánh");
        Student s3 = new Student("03", "Trọng An");
        s1.display();
        System.out.println();
        s2.display();
        System.out.println();
        s3.display();
        System.out.println();
        System.out.println("Tổng số sinh viên: "+ Student.totalStudent);
    }
}