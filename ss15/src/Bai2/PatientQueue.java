package Bai2;

public class PatientQueue {
    private Patient[] queue;
    private int front;
    private int rear;
    private int size = 100;
    public PatientQueue() {
        queue = new Patient[size];
        front = 0;
        rear = -1;
    }
    public void addPatient(Patient p) {
        if (rear < size - 1) {
            rear++;
            queue[rear] = p;
            System.out.println("Da them benh nhan.");
        } else {
            System.out.println("Queue day.");
        }
    }
    public Patient callNextPatient() {
        if (isEmpty()) {
            System.out.println("Khong co benh nhan.");
            return null;
        }

        Patient p = queue[front];
        front++;
        return p;
    }
    public Patient peekNextPatient() {
        if (isEmpty()) return null;
        return queue[front];
    }

    public boolean isEmpty() {
        return front > rear;
    }
    public void displayQueue() {
        if (isEmpty()) {
            System.out.println("Khong co benh nhan dang cho.");
            return;
        }
        System.out.println("Danh sach benh nhan:");
        for (int i = front; i <= rear; i++) {
            queue[i].display();
        }
    }
}
