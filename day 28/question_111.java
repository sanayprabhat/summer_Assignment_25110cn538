
import java.util.Scanner;

public class question_111 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ticketNo = 0, choice;
        String name = "", destination = "";
        boolean booked = false;
        do {
            System.out.println("  Ticket Booking System  ");
            System.out.println("1. Book Ticket");
            System.out.println("2. View Ticket");
            System.out.println("3. Cancel Ticket");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter Ticket Number: ");
                    ticketNo = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Passenger Name: ");
                    name = sc.nextLine();
                    System.out.print("Enter Destination: ");
                    destination = sc.nextLine();
                    booked = true;
                    System.out.println("Ticket booked successfully.");
                    break;
                case 2:
                    if (booked) {
                        System.out.println("\n  Ticket Details  ");
                        System.out.println("Ticket Number : " + ticketNo);
                        System.out.println("Passenger Name: " + name);
                        System.out.println("Destination   : " + destination);
                    } else {
                        System.out.println("No ticket booked.");
                    }
                    break;
                case 3:
                    if (booked) {
                        booked = false;
                        System.out.println("Ticket cancelled successfully.");
                    } else {
                        System.out.println("No ticket to cancel.");
                    }
                    break;
                case 4:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid input");
            }
        } while (choice != 4);
    }    
}
