import java.util.Set;
import java.util.HashSet;
public class Bai3 {
    public static void main(String[] args) {
        Set<String> thuocMoi = new HashSet<>();
        thuocMoi.add("Aspirin");
        thuocMoi.add("Caffeine");
        thuocMoi.add("Paracetamol");
        Set<String> diUng = new HashSet<>();
        diUng.add("Penicillin");
        diUng.add("Aspirin");
        Set<String> canhBao = new HashSet<>(thuocMoi);
        canhBao.retainAll(diUng);
        Set<String> anToan = new HashSet<>(thuocMoi);
        anToan.removeAll(diUng);
        System.out.println("Cảnh báo dị ứng: " + canhBao);
        System.out.println("Thành phần an toàn: " + anToan);
    }
}
