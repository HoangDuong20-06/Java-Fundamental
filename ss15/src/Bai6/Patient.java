package Bai6;

public class Patient {

    public String id;
    public String name;
    public int age;
    public String gender;

    public Patient(String id, String name, int age, String gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void display(){
        System.out.println(id + " - " + name + " - " + age + " - " + gender);
    }
}