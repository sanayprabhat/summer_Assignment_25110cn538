import java.util.Scanner;
public class Reverse_a_number
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int temp, m = 0;
        while(n!=0)
        {
            temp = n%10;
            m = m*10 + temp;
            n/=10;
        }
        System.out.println("The reversed number is: " +m);
    }
}