package Bai6;

public class TicketSystem {

    public Ticket[] ticketQueue;
    public int front;
    public int rear;
    public int currentNumber;

    public TicketSystem(){
        ticketQueue = new Ticket[100];
        front = 0;
        rear = -1;
        currentNumber = 0;
    }

    public void issueTicket(String time){

        currentNumber++;

        rear++;
        ticketQueue[rear] = new Ticket(currentNumber,time);
    }

    public Ticket callNext(){

        if(front > rear){
            return null;
        }

        Ticket t = ticketQueue[front];
        front++;

        return t;
    }
}