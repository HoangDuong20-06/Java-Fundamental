import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Bai4 {
    public static void main(String[] args) {

        String cardID = "TV202312345";
        String regex = "^[A-Z]{2}\\d{4}\\d{5}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(cardID);

        if (matcher.matches()) {
            System.out.println("Ma the hop le!");
        } else {
            if (!cardID.matches("^[A-Z]{2}.*")) {
                System.out.println("Thieu tien to!");
            } else if (!cardID.matches("^[A-Z]{2}\\d{4}.*")) {
                System.out.println("Nam khong hop le!");
            } else {
                System.out.println("Dinh dang khong hop le!");
            }
        }
    }
}
