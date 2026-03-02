package Bai6;

public class PatientWaitingQueue {

    public Patient[] waitingQueue;
    public int front;
    public int rear;
    public int totalPatients;

    public PatientWaitingQueue(){
        waitingQueue = new Patient[100];
        front = 0;
        rear = -1;
        totalPatients = 0;
    }

    public void addPatient(Patient p){
        rear++;
        waitingQueue[rear] = p;
        totalPatients++;
    }

    public Patient callPatient(){

        if(front > rear){
            return null;
        }

        Patient p = waitingQueue[front];
        front++;
        totalPatients--;

        return p;
    }

    public void displayQueue(){

        for(int i = front; i <= rear; i++){
            waitingQueue[i].display();
        }
    }
}