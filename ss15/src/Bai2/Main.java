package Bai2;

public class Main {
    public static void main(String[] args) {

        PatientQueue queue = new PatientQueue();

        queue.addPatient(new Patient("P1", "An", 20));
        queue.addPatient(new Patient("P2", "Binh", 25));
        queue.addPatient(new Patient("P3", "Cuong", 30));

        System.out.println("\nDanh sach benh nhan dang cho:");
        queue.displayQueue();
        System.out.println("\nBenh nhan tiep theo:");
        Patient p = queue.peekNextPatient();
        if (p != null) p.display();
        System.out.println("\nGoi kham:");
        Patient next = queue.callNextPatient();
        if (next != null) next.display();

        System.out.println("\nDanh sach con lai:");
        queue.displayQueue();
    }
}