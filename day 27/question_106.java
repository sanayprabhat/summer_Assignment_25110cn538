
import java.util.Scanner;

public class question_106 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int id = 0, choice;
        String name = "", department = "";
        double salary = 0;
        do {
            System.out.println("\n  Employee Management System  ");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employee");
            System.out.println("3. Update Salary");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter Employee ID: ");
                    id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Employee Name: ");
                    name = sc.nextLine();
                    System.out.print("Enter Department: ");
                    department = sc.nextLine();
                    System.out.print("Enter Salary: ");
                    salary = sc.nextDouble();
                    System.out.println("Employee record added.");
                    break;
                case 2:
                    System.out.println(" \n  Employee Record  ");
                    System.out.println("Employee ID : " + id);
                    System.out.println("Name        : " + name);
                    System.out.println("Department  : " + department);
                    System.out.println("Salary      : " + salary);
                    break;
                case 3:
                    System.out.print("Enter new salary: ");
                    salary = sc.nextDouble();
                    System.out.println("Salary updated");
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
