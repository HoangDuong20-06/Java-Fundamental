package Bai1;
public class Main {
    public static void main(String[] args) {

        MedicalRecordHistory history = new MedicalRecordHistory();

        EditAction e1 = new EditAction("Sua thong tin benh nhan", "10:00");
        EditAction e2 = new EditAction("Them ket qua xet nghiem", "10:10");
        EditAction e3 = new EditAction("Cap nhat don thuoc", "10:20");

        history.addEdit(e1);
        history.addEdit(e2);
        history.addEdit(e3);

        history.displayHistory();

        System.out.println("\nUndo:");
        EditAction undo = history.undoEdit();
        if (undo != null) {
            undo.display();
        }

        System.out.println("\nChinh sua gan nhat:");
        EditAction latest = history.getLatestEdit();
        if (latest != null) {
            latest.display();
        }

        System.out.println("\nLich su sau khi undo:");
        history.displayHistory();
    }
}