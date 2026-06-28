
import java.util.Scanner;

public class question_109 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bookId = 0, choice;
        String bookName = "", author = "";
        boolean issued = false;
        do {
            System.out.println("\n===== Library Management System =====");
            System.out.println("1. Add Book");
            System.out.println("2. View Book");
            System.out.println("3. Issue Book");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter Book ID: ");
                    bookId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Book Name: ");
                    bookName = sc.nextLine();
                    System.out.print("Enter Author Name: ");
                    author = sc.nextLine();
                    issued = false;
                    System.out.println("Book added successfully");
                    break;
                case 2:
                    System.out.println("\n  Book Details  ");
                    System.out.println("Book ID   : " + bookId);
                    System.out.println("Book Name : " + bookName);
                    System.out.println("Author    : " + author);
                    if (issued) {
                        System.out.println("Status    : Issued");
                    } else {
                        System.out.println("Status    : Available");
                    }
                    break;
                case 3:
                    if (issued == false) {
                        issued = true;
                        System.out.println("Book issued successfully");
                    } else {
                        System.out.println("Book is already issued");
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
