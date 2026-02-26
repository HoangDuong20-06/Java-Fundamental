import java.util.LinkedList;
public class Bai4 {
    LinkedList<String> queue = new LinkedList<>();
    public void patientCheckIn(String name) {
        queue.addLast(name);
    }
    public void emergencyCheckIn(String name) {
        queue.addFirst(name);
    }
    public void treatPatient() {
        if (!queue.isEmpty()) {
            String name = queue.removeFirst();
            if (name.equals("C")) {
                System.out.println("Đang cấp cứu: " + name);
            } else {
                System.out.println("Đang khám: " + name);
            }
        }
    }
    public static void main(String[] args) {
        Bai4 er = new Bai4();
        er.patientCheckIn("A");
        er.patientCheckIn("B");
        er.emergencyCheckIn("C");
        er.treatPatient();
        er.treatPatient();
        er.treatPatient();
    }
}