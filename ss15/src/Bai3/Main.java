package Bai3;

public class Main {
    public static void main(String[] args) {

        MedicationProcessChecker checker = new MedicationProcessChecker();

        String[] actions = {
                "PUSH",
                "PUSH",
                "POP",
                "POP"
        };
        boolean result = checker.checkProcess(actions);

        if (result) {
            System.out.println("Quy trinh hop le.");
        } else {
            System.out.println("Quy trinh khong hop le.");
        }
    }
}