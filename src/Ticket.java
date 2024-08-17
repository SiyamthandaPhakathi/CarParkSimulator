/*
Author: Siyamthanda Phakathi
Student number: PHKSIY006
Date: 15 August 2024
Program: A Java Ticket class that contains the ID and issue time for a car park ticket
*/
public class Ticket {

    //Instance variables
    private String id;
    private Time issueTime;

    //Constructor
    Ticket(Time currentTime, String ID){
        this.id = ID;
        this.issueTime = currentTime;

    }

    //Methods

    public String ID(){
        return this.id;
    }

    public Duration age(Time currentTime){
        return currentTime.subtract(this.issueTime);
    }

    public String toString(){

        return "Ticket[id="+this.id+", time="+this.issueTime.toString()+"]";
    }
}
