import java.util.Scanner;

public class question_45
{
    static boolean  palindrome(int n)
    {
        int m=n, s=0;
        while(m>0)
        {
            int temp = m%10;
            s = s*10 + temp;
            m/=10;
        }
        if(s==n)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n=sc.nextInt();

        if(palindrome(n))
            System.out.println("Number is palindrome");
        else
            System.out.println("Number is not palindrome");
    }
}