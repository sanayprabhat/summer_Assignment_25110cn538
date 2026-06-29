
import java.util.Scanner;

public class question_116 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int productId = 0, quantity = 0, choice;
        String productName = "";
        do {
            System.out.println("\n  Inventory Management System  ");
            System.out.println("1. Add Product");
            System.out.println("2. View Product");
            System.out.println("3. Update Quantity");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter Product ID: ");
                    productId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Product Name: ");
                    productName = sc.nextLine();
                    System.out.print("Enter Quantity: ");
                    quantity = sc.nextInt();
                    System.out.println("Product added successfully");
                    break;
                case 2:
                    System.out.println("\n  Product Details  ");
                    System.out.println("Product ID   : " + productId);
                    System.out.println("Product Name : " + productName);
                    System.out.println("Quantity     : " + quantity);
                    break;
                case 3:
                    System.out.print("Enter new quantity: ");
                    quantity = sc.nextInt();
                    System.out.println("Quantity updated successfully");
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
