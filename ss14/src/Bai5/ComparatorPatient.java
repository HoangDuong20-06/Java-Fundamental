package Bai5;
import java.util.Comparator;
public class ComparatorPatient implements Comparator<Patient> {
    public int compare(Patient p1, Patient p2) {

        if (p1.severity != p2.severity) {
            return p1.severity - p2.severity;
        }

        return p1.arrivalTime - p2.arrivalTime;
    }
}
