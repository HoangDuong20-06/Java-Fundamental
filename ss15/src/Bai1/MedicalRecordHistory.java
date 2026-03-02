package Bai1;

public class MedicalRecordHistory {

    private EditAction[] history;
    private int top;
    private int maxSize = 100;

    public MedicalRecordHistory() {
        history = new EditAction[maxSize];
        top = -1;
    }
    public void addEdit(EditAction action) {
        if (top < maxSize - 1) {
            top++;
            history[top] = action;
            System.out.println("Da them chinh sua.");
        } else {
            System.out.println("Stack day.");
        }
    }
    public EditAction undoEdit() {
        if (isEmpty()) {
            System.out.println("Khong co gi de undo.");
            return null;
        }

        EditAction action = history[top];
        top--;
        return action;
    }
    public EditAction getLatestEdit() {
        if (isEmpty()) {
            return null;
        }
        return history[top];
    }
    public boolean isEmpty() {
        return top == -1;
    }
    public void displayHistory() {
        if (isEmpty()) {
            System.out.println("Lich su rong.");
            return;
        }

        System.out.println("Danh sach lich su:");
        for (int i = top; i >= 0; i--) {
            history[i].display();
        }
    }
}
