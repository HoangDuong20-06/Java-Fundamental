package Bai4;

public class EmergencyPatient {

    private String id;
    private String name;
    private int priority;
    public EmergencyPatient(String id, String name, int priority) {
        this.id = id;
        this.name = name;
        this.priority = priority;
    }
    public int getPriority() {
        return priority;
    }
    public void display() {
        System.out.println(id + " - " + name + " - Priority: " + priority);
    }
}
