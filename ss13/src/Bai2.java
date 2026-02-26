import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Bai2 {
    public static List<String> sort(List<String> list){
        ArrayList<String> result = new ArrayList<>();
        for(String medicine : list){
            if(!result.contains(medicine)){
                result.add(medicine);
            }
        }
        Collections.sort(result);
        return result;
    }

    public static void main(String[] args) {
        List<String> input = new ArrayList<>();
        input.add("Paracetamol");
        input.add("Ibuprofen");
        input.add("Panadol");
        input.add("Paracetamol");
        input.add("Aspirin");
        input.add("Ibuprofen");
        System.out.println("Danh sách thuốc ban đầu : " + input);
        List<String> ouput = sort(input);
        System.out.println("Danh sách thuốc sau sắp xếp và lọc: " + ouput);
    }
}
