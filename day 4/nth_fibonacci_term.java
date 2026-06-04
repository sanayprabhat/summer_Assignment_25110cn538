import java.util.Scanner;
public class nth_fibonacci_term {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter term to find: ");
        int n = sc.nextInt();
        int f=-1, s = 1, t=f+s;
        for(int i = 1; i<=n;i++)
        {
            t=f+s;
            f=s;
            s=t;
        }
        System.out.println("The " + n + "th term of the fibonacci series is: " + t);
        
    }
}
