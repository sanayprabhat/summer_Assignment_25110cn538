
import java.util.Scanner;

public class question_110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int accountNo = 0, choice;
        String name = "";
        double balance = 0, amount;
        do {
            System.out.println("\n  Bank Account System  ");
            System.out.println("1. Create Account");
            System.out.println("2. View Account");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter Account Number: ");
                    accountNo = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Account Holder Name: ");
                    name = sc.nextLine();
                    System.out.print("Enter Initial Balance: ");
                    balance = sc.nextDouble();
                    System.out.println("Account created successfully.");
                    break;
                case 2:
                    System.out.println("\n----- Account Details -----");
                    System.out.println("Account Number : " + accountNo);
                    System.out.println("Account Holder : " + name);
                    System.out.println("Balance        : ₹" + balance);
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    amount = sc.nextDouble();
                    if (amount <= balance) {
                        balance = balance - amount;
                        System.out.println("Withdrawal successful.");
                        System.out.println("Remaining Balance: ₹" + balance);
                    } else {
                        System.out.println("Insufficient Balance.");
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
