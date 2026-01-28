import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Bai5 {
    public static void main(String[] args) {

        String log = "2024-05-20 | User: NguyenVanA | Action: BORROW | BookID: BK12345";

        String regex = "(\\d{4}-\\d{2}-\\d{2}).*User: (\\w+).*Action: (\\w+).*BookID: (\\w+)";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(log);

        int borrow = 0;
        int ret = 0;

        if (matcher.find()) {
            String date = matcher.group(1);
            String user = matcher.group(2);
            String action = matcher.group(3);
            String book = matcher.group(4);

            if (action.equals("BORROW")) borrow++;
            if (action.equals("RETURN")) ret++;

            System.out.println("Ngay: " + date);
            System.out.println("Nguoi dung: " + user);
            System.out.println("Hanh dong: " + action);
            System.out.println("Ma sach: " + book);
        }
    }
}
