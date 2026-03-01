import java.util.LinkedHashSet;
public class Bai1 {
    public static void main(String[] args) {
        LinkedHashSet<String> danhSach = new LinkedHashSet<>();
        danhSach.add("Nguyễn Văn A – Yên Bái");
        danhSach.add("Trần Thị B – Thái Bình");
        danhSach.add("Nguyễn Văn A – Yên Bái");
        danhSach.add("Lê Văn C – Hưng Yên");
        System.out.println("Danh sách gọi khám:");
        for (String ten : danhSach) {
            System.out.println(ten);
        }
    }
}
