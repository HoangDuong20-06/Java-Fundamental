package Bai5;

public class TreatmentStep {

    public String description;
    public String time;

    public TreatmentStep(String description, String time) {
        this.description = description;
        this.time = time;
    }

    public void display() {
        System.out.println(description + " - " + time);
    }
}