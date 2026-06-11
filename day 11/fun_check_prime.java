
import java.util.Scanner;

public class fun_check_prime {
    static boolean  prime(int a)
    {
        int count=0;
        if(a<1)
            return false;

        for(int i=1;i<=a;i++)
        {
            if(a%i==0)
                count++;
        }
        if(count==2)
            return true;

        return false;

    }    

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (prime(n)==true)
            System.out.println(n + " is Prime");
        else
            System.out.println(n + " is not Prime");
    }
}
