package Bai5;

public class EmergencyPatient {

    public String id;
    public String name;
    public int age;

    public EmergencyPatient(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println(id + " - " + name + " - " + age);
    }
}