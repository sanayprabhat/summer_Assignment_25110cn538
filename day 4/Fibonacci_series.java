
import java.util.Scanner;

public class Fibonacci_series
{
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter range: ");
     int range = sc.nextInt();
     int f = -1, s = 1, t=f+s ;
     for(int i=3;i<range;i++)
        {
            t = f+s;
            f=s;
            s=t;
            System.out.print(t+ " " );
        }   
    }
}