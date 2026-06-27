
import java.util.Scanner;

public class question_105 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int id = 0, marks = 0;
        String name = "", course = "";
        int choice;
        do {
            System.out.println("\n Student Record Management ");
            System.out.println("1 Add Student Record");
            System.out.println("2 View Student Record");
            System.out.println("3 Update Marks");
            System.out.println("4 Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter Student ID: ");
                    id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Student Name: ");
                    name = sc.nextLine();
                    System.out.print("Enter Course: ");
                    course = sc.nextLine();
                    System.out.print("Enter Marks: ");
                    marks = sc.nextInt();
                    System.out.println("Student record added");
                    break;
                case 2:
                    System.out.println("  \n Student Record  ");
                    System.out.println("Student ID : " + id);
                    System.out.println("Name       : " + name);
                    System.out.println("Course     : " + course);
                    System.out.println("Marks      : " + marks);
                    break;
                case 3:
                    System.out.print("Enter new marks: ");
                    marks = sc.nextInt();
                    System.out.println("Marks updated");
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
