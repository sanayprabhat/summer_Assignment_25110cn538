
import java.util.Scanner;

public class question_104 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = 0;
        char ans;
        System.out.println("1. Which planet is known as the Red Planet?");
        System.out.println("a) Earth");
        System.out.println("b) Mars");
        System.out.println("c) Venus");
        System.out.println("d) Jupiter");
        System.out.print("Enter your answer: ");
        ans = sc.next().charAt(0);
        if (ans == 'b' || ans == 'B') {
            score++;
        }
        System.out.println("\n2. Which is the largest ocean in the world?");
        System.out.println("a) Indian Ocean");
        System.out.println("b) Atlantic Ocean");
        System.out.println("c) Pacific Ocean");
        System.out.println("d) Arctic Ocean");
        System.out.print("Enter your answer: ");
        ans = sc.next().charAt(0);
        if (ans == 'c' || ans == 'C') {
            score++;
        }
        System.out.println("\n3. Which is the national animal of India?");
        System.out.println("a) Tiger");
        System.out.println("b) Lion");
        System.out.println("c) Elephant");
        System.out.println("d) Leopard");
        System.out.print("Enter your answer: ");
        ans = sc.next().charAt(0);
        if (ans == 'a' || ans == 'A') {
            score++;
        }
        System.out.println("\nYour Score = " + score + "/3");
    }    
}
