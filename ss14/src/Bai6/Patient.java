package Bai6;

public class Patient {
    String name;
    int age;
    String khoa;

    public Patient(String name, int age, String khoa) {
        this.name = name;
        this.age = age;
        this.khoa = khoa;
    }

    public String toString() {
        return name;
    }
}
