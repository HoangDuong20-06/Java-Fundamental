package Bai6;

public class Ticket {

    public int ticketNumber;
    public String issuedTime;

    public Ticket(int ticketNumber, String issuedTime){
        this.ticketNumber = ticketNumber;
        this.issuedTime = issuedTime;
    }

    public void display(){
        System.out.println("Ticket " + ticketNumber + " - " + issuedTime);
    }
}