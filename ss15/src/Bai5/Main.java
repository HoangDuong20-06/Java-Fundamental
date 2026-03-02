package Bai5;

public class Main {

    public static void main(String[] args) {

        EmergencyCaseQueue queue = new EmergencyCaseQueue();

        EmergencyPatient p1 = new EmergencyPatient("P1","An",20);

        EmergencyCase case1 = new EmergencyCase(p1);

        queue.addCase(case1);

        EmergencyCase current = queue.getNextCase();

        if(current != null){

            System.out.println("Dang xu ly benh nhan:");
            current.displayPatient();

            current.addStep(new TreatmentStep("Tiep nhan","10:00"));
            current.addStep(new TreatmentStep("Chan doan","10:05"));
            current.addStep(new TreatmentStep("Dieu tri","10:10"));

            current.displaySteps();

            System.out.println("\nUndo buoc gan nhat:");
            current.undoStep();

            current.displaySteps();
        }
    }
}