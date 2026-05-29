import java.util.Scanner;
public class Palindrome_number
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int m =n, temp, rev =0;
        while(m!=0)
        {
            temp = m%10;
            rev = rev*10 + temp;
            m/=10;
        }
        if(rev == n)
        System.out.println("The number is palindrome");
        else
        System.out.println("The number is not palindrome");
    }
}