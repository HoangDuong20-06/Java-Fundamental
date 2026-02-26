import java.util.ArrayList;
import java.util.Iterator;

public class Bai1 {
    public static void main(String[] args) {
        ArrayList<Double> temperature= new ArrayList<>();
        temperature.add(36.5);
        temperature.add(40.2);
        temperature.add(37.0);
        temperature.add(12.5);
        temperature.add(39.8);
        temperature.add(99.9);
        temperature.add(36.8);
        System.out.println("Danh sách ban đầu: " + temperature);
        Iterator<Double> iter = temperature.iterator();
        while (iter.hasNext()){
            double temper = iter.next();
            if(temper < 34.0 || temper > 42.0){
                iter.remove();
            }
        }
        System.out.println("Danh sách sau khi lọc : "+ temperature);
        double sum = 0;
        for (double nhietdo : temperature){
            sum += nhietdo;
        }
        double trungBinh = sum / temperature.size();
        System.out.printf("Nhiệt độ trung bình : %2f", trungBinh);
    }
}