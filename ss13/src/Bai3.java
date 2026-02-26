import java.util.ArrayList;
import java.util.List;
public class Bai3 {
    public static <T> List<T> findCommonPatients(List<T> ListA, List<T> ListB){
        List<T> result = new ArrayList<>();
        for( T item : ListA){
            if(ListB.contains(item) && !result.contains(item)){
                result.add(item);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(101);
        list1.add(102);
        list1.add(103);
        List<Integer> list2 = new ArrayList<>();
        list2.add(102);
        list2.add(103);
        list2.add(108);
        List<Integer> commonInt = findCommonPatients(list2,list1);
        List<String> list3 = new ArrayList<>();
        list3.add("DN001");
        list3.add("DN002");
        list3.add("DN003");
        List<String> list4 = new ArrayList<>();
        list4.add("DN002");
        list4.add("DN004");
        List<String> commonStr = findCommonPatients(list3,list4);
        System.out.println("Danh sách bệnh nhân khám bệnh ở cả 2 khoa: ");
        System.out.println(commonInt);
        System.out.println(commonStr);
    }
}
