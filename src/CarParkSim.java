import java.sql.SQLOutput;
import java.util.Scanner;
/**
 * The CarParkSim class contains the main car park simulation method.
 * It creates and manipulates the main objects, and handles user I/O.
 *
 * @author Stephan Jamieson and Siyamthanda Phakathi
 * @version 15/8/2024
 */
public class CarParkSim {

    public static void main(final String[] args) {
        final Scanner keyboard = new Scanner(System.in);
        // YOUR CODE HERE.
        // Declare variables to store a Clock and a Register object, create the relevant objects and assign them.
        Time startTime = new Time("00:00");
        Clock clock = new Clock(startTime);
        Register register = new Register();
        System.out.println("Car Park Simulator");

        // YOUR CODE HERE.
        // Print current time.
        System.out.println("The current time is "+startTime.toString()+".");
        System.out.println("Commands: advance {minutes}, arrive, depart, quit.");
        System.out.print(">");
        String input = keyboard.next().toLowerCase();
        while (!input.equals("quit")) {
            if (input.equals("advance")) {
                // YOUR CODE HERE.
                // Advance the clock, print the current time.
                Duration passed = new Duration("minute",Integer.parseInt(keyboard.next()));
                clock.advance(passed);
                System.out.println("The current time is "+ clock.examine().toString()+".");
            }
            else if (input.equals("arrive")) {
                // YOUR CODE HERE.
                // Create a new ticket, add it to the register, print details of ticket issued.
                Time currentTime = clock.examine();
                String ID = UIDGenerator.makeUID();
                Ticket ticket = new Ticket(currentTime,ID);
                register.add(ticket);
                System.out.println("Ticket issued: "+ ticket.toString()+".");
            }
            else if (input.equals("depart")) {
                // YOUR CODE HERE.
                // Determine if ticket is valid, i.e. in the register.
                // If not, print error message.
                // If yes, retreive it, calculate duration of stay and print it.
                String id = keyboard.next();
                if(register.contains(id)){
                    Time currentTime = clock.examine();
                    Ticket ticketDeparting = register.retrieve(id);
                    Duration stayTime = ticketDeparting.age(currentTime);
                    String stayTimef = Duration.format(stayTime,"hour","minute");
                    System.out.println("Ticket details: "+ ticketDeparting.toString()+".");
                    System.out.println("Current time: "+ currentTime.toString()+".");
                    System.out.println("Duration of stay: " +stayTimef +".");
                }
                else{
                    System.out.println("Invalid ticket ID.");
                }
            }
            else {
                System.out.println("That command is not recognised.");
                System.out.println("Commands: advance <minutes>, arrive, depart, quit.");
            }            
            System.out.print(">");
            input = keyboard.next().toLowerCase();
        }            
        System.out.println("Goodbye.");
    }

}
