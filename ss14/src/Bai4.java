import java.util.List;
import java.util.Arrays;
import java.util.TreeMap;
public class Bai4 {
    public static void main(String[] args) {
        List<String> ds = Arrays.asList(
                "Cúm A",
                "Sốt xuất huyết",
                "Cúm A",
                "Covid-19",
                "Cúm A",
                "Sốt xuất huyết"
        );
        TreeMap<String, Integer> map = new TreeMap<>();
        for (String benh : ds) {
            if (map.containsKey(benh)) {
                map.put(benh, map.get(benh) + 1);
            } else {
                map.put(benh, 1);
            }
        }
        for (String benh : map.keySet()) {
            System.out.println(benh + ": " + map.get(benh) + " ca");
        }
    }
}
