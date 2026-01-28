import java.time.LocalDate;
import java.util.Arrays;

public class Bai3 {
    public static void main(String[] args) {
        String[] transactions = {
                "BK001-20/01",
                "BK005-21/01",
                "BK099-22/01"
        };
        long startString = System.currentTimeMillis();
        String report1 = "--- BAO CAO MUON SACH ---\n";
        report1 += "Ngay tao: " + LocalDate.now() + "\n";
        for (String t : transactions) {
            report1 += "Giao dich: " + t + "\n";
        }
        long endString = System.currentTimeMillis();
        long startBuilder = System.currentTimeMillis();
        StringBuilder report2 = new StringBuilder();
        report2.append("--- BAO CAO MUON SACH ---\n");
        report2.append("Ngay tao: ").append(LocalDate.now()).append("\n");
        for (String t : transactions) {
            report2.append("Giao dich: ").append(t).append("\n");
        }
        long endBuilder = System.currentTimeMillis();
        System.out.println(report2);
        System.out.println("Thoi gian String: " + (endString - startString));
        System.out.println("Thoi gian StringBuilder: " + (endBuilder - startBuilder));
    }
}
