
import java.util.Scanner;

public class question_107 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int empId = 0, choice;
        String empName = "";
        double salary = 0;

        do {
            System.out.println("\n Salary Management System  ");
            System.out.println("1. Add Employee Salary");
            System.out.println("2. View Salary");
            System.out.println("3. Update Salary");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Employee ID: ");
                    empId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Employee Name: ");
                    empName = sc.nextLine();

                    System.out.print("Enter Salary: ");
                    salary = sc.nextDouble();

                    System.out.println("Salary record added.");
                    break;

                case 2:
                    System.out.println("\n  Salary Record  ");
                    System.out.println("Employee ID   : " + empId);
                    System.out.println("Employee Name : " + empName);
                    System.out.println("Salary        : " + salary);
                    break;

                case 3:
                    System.out.print("Enter new salary: ");
                    salary = sc.nextDouble();
                    System.out.println("Salary updated successfully.");
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
