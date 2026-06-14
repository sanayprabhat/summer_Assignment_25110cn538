
import java.util.Scanner;

public class quetion_53 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array length: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) 
        {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter element to search: ");
        int num = sc.nextInt();

        boolean flag = false;

        for (int i = 0; i < n; i++) {
            if (arr[i] == num) {
                System.out.println("Element found at index " + i);
                flag = true;
                break;
            }
        }

        if (flag== false) {
            System.out.println("Element not found.");
        }
    }
}
