import java.util.Scanner;
public class Count_digits
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int digits = 0, temp;
        while(n!=0)
        {
            temp = n%10;
            digits++;
            n/=10;
        }
        System.out.println("Number of digits = " +digits);
    }
}