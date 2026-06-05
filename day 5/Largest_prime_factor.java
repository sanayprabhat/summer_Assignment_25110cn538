
import java.util.Scanner;

public class Largest_prime_factor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        int fact =0;
        if(n<=1)
            System.out.println("No prime factors");
        while(n%2==0)
        {
            fact = 2;
            n/=2;
        }

        for(int i = 3; i<=n;i+=2)
        {
            while(n%i==0)
            {
                fact = i;
                n/=i;
            }
        }
        if(n>2)
            fact = n;
        System.out.println("Largest prime factor is: " +fact);
    }    
}
