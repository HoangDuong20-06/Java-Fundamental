package Bai5;

public class EmergencyCase {

    public EmergencyPatient patient;

    public TreatmentStep[] steps;
    public int top;

    public EmergencyCase(EmergencyPatient patient) {
        this.patient = patient;
        steps = new TreatmentStep[100];
        top = -1;
    }

    public void addStep(TreatmentStep step) {
        top++;
        steps[top] = step;
    }

    public TreatmentStep undoStep() {

        if (top == -1) {
            System.out.println("Khong co buoc de undo");
            return null;
        }

        TreatmentStep s = steps[top];
        top--;
        return s;
    }

    public void displaySteps() {

        System.out.println("Cac buoc xu ly:");

        for (int i = top; i >= 0; i--) {
            steps[i].display();
        }
    }

    public void displayPatient() {
        patient.display();
    }
}