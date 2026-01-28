import java.util.Scanner;
public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten sach: ");
        String book = sc.nextLine();
        System.out.print("Nhap ten tac gia: ");
        String artist = sc.nextLine();
        book = book.trim().replaceAll("\\s+", " ").toUpperCase();
        artist = artist.trim().replaceAll("\\s+", " ");
        String[] word = artist.split(" ");
        String formatArtist = "";
        for (String w : word){
            formatArtist += w.substring(0,1).toUpperCase()
                    + w.substring(1).toLowerCase()+ " ";
        }
        formatArtist = formatArtist.trim();
        System.out.print("["+book+"]" +" - " + "Tac gia: " + formatArtist);
    }
}