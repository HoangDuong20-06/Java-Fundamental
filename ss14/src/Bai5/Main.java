package Bai5;
import java.util.TreeSet;
public class Main {
    public static void main(String[] args) {
        TreeSet<Patient> queue = new TreeSet<>(new ComparatorPatient());
        queue.add(new Patient("A", 3, 800));
        queue.add(new Patient("B", 1, 815));
        queue.add(new Patient("C", 1, 805));
        for (Patient p : queue) {
            if (p.name.equals("C")) {
                System.out.println("Bệnh nhân C (Mức 1 - Nguy kịch, đến sớm hơn B)");
            }
            else if (p.name.equals("B")) {
                System.out.println("Bệnh nhân B (Mức 1 - Nguy kịch, đến sau C)");
            }
            else {
                System.out.println("Bệnh nhân A (Mức 3 - Nhẹ)");
            }
        }
    }
}
