package Bai4;

public class Main {
    public static void main(String[] args) {

        EmergencyQueue queue = new EmergencyQueue();
        queue.addPatient(new EmergencyPatient("P1", "An", 2));
        queue.addPatient(new EmergencyPatient("P2", "Binh", 1));
        queue.addPatient(new EmergencyPatient("P3", "Cuong", 2));
        queue.addPatient(new EmergencyPatient("P4", "Dung", 1));
        System.out.println("\nDanh sach benh nhan:");
        queue.displayQueue();
        System.out.println("\nGoi kham benh nhan:");
        EmergencyPatient p = queue.callNextPatient();
        if (p != null) p.display();
        System.out.println("\nDanh sach con lai:");
        queue.displayQueue();
    }
}
