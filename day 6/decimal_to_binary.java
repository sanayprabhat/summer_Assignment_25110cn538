
import java.util.Scanner;


public class decimal_to_binary {
    public static void main(String[] args) {
            Scanner sc = new Scanner( System.in);
            System.out.println("Enter decimal number: ");
            int n = sc.nextInt();
            int[] arr = new int[50];
            if(n==0)
            {
                System.out.println("Binary = 0 ");
                return;
            }
            int i =0;
            while(n>0)
            {
                arr[i] = n%2;
                n/=2;
                i++;
            }
            System.out.println("Binary = ");
            for(int j=i-1;j>=0;j--)
                System.out.print(arr[j]);

    }    
}
