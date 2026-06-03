import java.util.Scanner;
public class Prime_number
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        int fact =0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            fact ++;
        }
        if(fact == 2)
        System.out.println("The number is prime");
        else
        System.out.println("The number is not prime");
    }
}