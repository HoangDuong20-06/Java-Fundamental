package Bai3;

public class MedicationProcessChecker {
    private String[] stack;
    private int top;
    private int size = 100;

    public MedicationProcessChecker() {
        stack = new String[size];
        top = -1;
    }
    public boolean checkProcess(String[] actions) {
        for (int i = 0; i < actions.length; i++) {

            if (actions[i].equals("PUSH")) {
                top++;
                stack[top] = "medicine";
            }
            else if (actions[i].equals("POP")) {

                if (top == -1) {
                    System.out.println("Sai: POP khi stack rong");
                    return false;
                }

                top--;
            }
        }
        if (top != -1) {
            System.out.println("Sai: Chua hoan tat het thuoc");
            return false;
        }
        System.out.println("Quy trinh hop le");
        return true;
    }
    public void reset() {
        top = -1;
    }
}
