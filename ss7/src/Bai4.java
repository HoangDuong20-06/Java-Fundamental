class ClassRoom {
    public static double classFund = 0;

    private String studentName;

    public ClassRoom(String studentName) {
        this.studentName = studentName;
    }

    public void payFund(double amount) {
        classFund += amount;
        System.out.println(studentName + " đã đóng: " + amount);
    }

    public static void showFund() {
        System.out.println("Tổng quỹ lớp: " + classFund);
    }
}
public class Bai4 {
    public static void main(String[] args) {
        ClassRoom s1 = new ClassRoom("An");
        ClassRoom s2 = new ClassRoom("Bình");
        ClassRoom s3 = new ClassRoom("Chi");

        s1.payFund(100000);
        s2.payFund(150000);
        s3.payFund(200000);

        ClassRoom.showFund();
    }
}
