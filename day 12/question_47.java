
import java.util.Scanner;

public class question_47 {
    static int fibonacci(int n)
    {

        if(n<=1)
            return n;

        int f=-0, s=1, t=f+s;
        for(int i=2;i<=n;i++)
        {
            t= f+s;
            f=s;
            s=t;
        }
        return t;
    }    


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter range: ");
        int n = sc.nextInt();

        System.out.println(fibonacci(n));
    }
}
