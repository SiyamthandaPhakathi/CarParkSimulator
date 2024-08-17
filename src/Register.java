/*
Author: Siyamthanda Phakathi
Student number: PHKSIY006
Date: 15 August 2024
Program: A Java class called Register that contains a list of Ticket objects
*/
public class Register {

    //instance variables
    private Ticket[] tickets;
    private int numTickets;

    //Constructors
    Register(){
        this.numTickets = 0;
        this.tickets = new Ticket[100];

    }

    //Methods
    //Add a Ticket object to the tickets array
    public void add(Ticket ticket){
        this.tickets[numTickets] = ticket;
        numTickets++;
    }

    //Check if ticket of the input id is in the register and return true
    //else return false
    public boolean contains(String ticketID){
        boolean containsID = false;
        for (int i = 0; i < this.numTickets; i++){
            if(ticketID.equals(tickets[i].ID())){
                containsID = true;
            }
        }
        return containsID;

    }

    //If ticket with input ID is found return it
    //else return null
    public Ticket retrieve(String ticketID) {
        for (int i = 0; i < this.numTickets; i++) {
            if (ticketID.equals(tickets[i].ID())) {
                return tickets[i];
            }
        }

        return null;
    }
}
