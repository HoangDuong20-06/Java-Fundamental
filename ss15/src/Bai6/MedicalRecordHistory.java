package Bai6;

public class MedicalRecordHistory {

    public EditAction[] editStack;
    public int top;
    public String recordId;

    public MedicalRecordHistory(String recordId) {

        this.recordId = recordId;
        editStack = new EditAction[100];
        top = -1;
    }

    public void addEdit(EditAction action) {

        top++;
        editStack[top] = action;
    }

    public EditAction undoEdit() {

        if (top == -1) {
            System.out.println("Khong co lich su de undo");
            return null;
        }

        EditAction action = editStack[top];
        top--;

        return action;
    }

    public void displayHistory() {

        System.out.println("Lich su benh an: " + recordId);

        for (int i = top; i >= 0; i--) {
            editStack[i].display();
        }
    }
}