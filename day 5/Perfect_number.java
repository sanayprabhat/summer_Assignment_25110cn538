
import java.util.Scanner;

public class Perfect_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int sum =0;
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                sum+= i;
            }
        }
        if(sum == n)
            System.out.println("The number is perfect");
        else 
            System.out.println("The number is not perfect");
    }    
}
