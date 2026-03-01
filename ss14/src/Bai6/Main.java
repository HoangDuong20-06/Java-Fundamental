package Bai6;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<Patient> list = new ArrayList<>();

        list.add(new Patient("Lan", 25, "Tim mạch"));
        list.add(new Patient("Hùng", 30, "Nội tiết"));
        list.add(new Patient("Mai", 22, "Tim mạch"));

        HashMap<String, List<Patient>> map = new HashMap<>();

        for (Patient p : list) {

            if (!map.containsKey(p.khoa)) {
                map.put(p.khoa, new ArrayList<Patient>());
            }

            map.get(p.khoa).add(p);
        }

        for (String khoa : map.keySet()) {
            System.out.println("Khoa " + khoa + " -> " + map.get(khoa));
        }

        String khoaDongNhat = "";
        int max = 0;

        for (String khoa : map.keySet()) {

            int size = map.get(khoa).size();

            if (size > max) {
                max = size;
                khoaDongNhat = khoa;
            }
        }

        System.out.println("Khoa " + khoaDongNhat + " đang đông nhất (" + max + " bệnh nhân)");
    }
}