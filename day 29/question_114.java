
import java.util.Scanner;

public class question_114 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int choice, sum, max;
        do {
            System.out.println("\n  Array Operations  ");
            System.out.println("1. Enter Array Elements");
            System.out.println("2. Display Array");
            System.out.println("3. Find Sum");
            System.out.println("4. Find Largest Element");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter 5 elements:");
                    for (int i = 0; i < 5; i++) {
                        arr[i] = sc.nextInt();
                    }
                    break;
                case 2:
                    System.out.println("Array Elements:");
                    for (int i = 0; i < 5; i++) {
                        System.out.print(arr[i] + " ");
                    }
                    System.out.println();
                    break;
                case 3:
                    sum = 0;
                    for (int i = 0; i < 5; i++) {
                        sum += arr[i];
                    }
                    System.out.println("Sum = " + sum);
                    break;
                case 4:
                    max = arr[0];
                    for (int i = 1; i < 5; i++) {
                        if (arr[i] > max) {
                            max = arr[i];
                        }
                    }
                    System.out.println("Largest Element = " + max);
                    break;
                case 5:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid input");
            }
        } while (choice != 5);
    }    
}
