import java.util.regex.Pattern;

public class Bai6 {
    public static void main(String[] args) {

        String review = "Cuon sach nay rat te, noi dung that la ngu ngoc va khong dang doc.";
        String[] blacklist = {"te", "ngu ngoc", "khong dang"};

        for (String word : blacklist) {
            review = review.replaceAll("(?i)" + Pattern.quote(word), "****");
        }

        if (review.length() > 200) {
            review = review.substring(0, 200);
            int lastSpace = review.lastIndexOf(" ");
            if (lastSpace != -1) {
                review = review.substring(0, lastSpace);
            }
            review = review + "...";
        }

        System.out.println("Review sau khi xu ly:");
        System.out.println(review);
    }
}
