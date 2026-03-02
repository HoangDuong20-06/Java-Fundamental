package Bai5;

public class EmergencyCaseQueue {

    public EmergencyCase[] cases;
    public int front;
    public int rear;

    public EmergencyCaseQueue() {
        cases = new EmergencyCase[100];
        front = 0;
        rear = -1;
    }

    public void addCase(EmergencyCase c) {
        rear++;
        cases[rear] = c;
    }

    public EmergencyCase getNextCase() {

        if (front > rear) {
            return null;
        }

        EmergencyCase c = cases[front];
        front++;
        return c;
    }
}