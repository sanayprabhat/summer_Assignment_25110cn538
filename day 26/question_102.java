
import java.util.Scanner;

public class question_102 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        sc.nextLine(); // Clear input buffer

        System.out.print("Are citizen of India? ");
        String citizen = sc.nextLine();

        System.out.print("Do you have a Voter ID? ");
        String voterId = sc.nextLine();

        if (age >= 18 && (citizen.equals("yes") || citizen.equals("YES"))  && (voterId.equals("YES")) || voterId.equals("yes") ) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }
    }    
}
