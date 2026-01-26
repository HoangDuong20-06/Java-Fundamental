import  java.util.Scanner;
public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập mã sách (4 chữ số): ");
        int code = sc.nextInt();

        int units = code % 10;
        int dozens = (code / 10) % 10;
        int hundreds = (code / 100) % 10;
        int thousands = code / 1000;

        int sumFirstThree = thousands + hundreds + dozens;
        int checkDigit = sumFirstThree % 10;

        System.out.println("Chữ số kiểm tra kỳ vọng: " + checkDigit);

        boolean isValid = (checkDigit == units);
        System.out.println("Kết quả kiểm tra mã sách: " + (isValid ? "HỢP LỆ" : "SAI MÃ"));
    }
}
