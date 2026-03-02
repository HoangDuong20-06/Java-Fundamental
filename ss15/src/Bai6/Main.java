package Bai6;


public class Main {

    public static void main(String[] args) {

        // ===== Queue bệnh nhân chờ khám =====
        PatientWaitingQueue queue = new PatientWaitingQueue();

        queue.addPatient(new Patient("P1","An",20,"Nam"));
        queue.addPatient(new Patient("P2","Binh",25,"Nam"));

        System.out.println("Danh sach benh nhan cho:");
        queue.displayQueue();

        // ===== Hệ thống gọi số =====
        TicketSystem ticket = new TicketSystem();

        ticket.issueTicket("9:00");
        ticket.issueTicket("9:05");

        System.out.println("\nGoi so tiep theo:");
        Ticket t = ticket.callNext();
        if(t != null) t.display();
        MedicalRecordHistory history = new MedicalRecordHistory("REC001");
        history.addEdit(new EditAction("Them ket qua xet nghiem","Dr.A","10:00"));
        history.addEdit(new EditAction("Cap nhat don thuoc","Dr.B","10:10"));
        System.out.println("\nLich su chinh sua:");
        history.displayHistory();
        System.out.println("\nUndo chinh sua:");
        EditAction e = history.undoEdit();
        if(e != null) e.display();
        UndoManager undo = new UndoManager(10);
        undo.addAction(new InputAction("Ten","An","Anh","10:20"));
        System.out.println("\nUndo thao tac nhap:");
        InputAction a = undo.undo();
        if(a != null) a.display();
    }
}