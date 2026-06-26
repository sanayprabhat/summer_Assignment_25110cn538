
import java.util.Scanner;

public class question_101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = (int)(Math.random() * 100) + 1; // Random number from 1 to 100
        int guess;
        System.out.println("Guess a number between 1 and 100");
        do {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            if (guess > number) {
                System.out.println("High");
            } else if (guess < number) {
                System.out.println("Low");
            } else {
                System.out.println("Correct");
            }
        } while (guess != number);
    }    
}
