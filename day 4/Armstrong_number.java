
import java.util.Scanner;

public class Armstrong_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        int m = n, temp, count =0, sum =0, g =n;
        while(m!=0)
        {
            m/=10;
            count++;
        }
        while(g!=0)
        {
            temp = g%10;
            sum = sum + (int)Math.pow(temp, count);
            g /= 10;
        }
        if (sum == n)
            System.out.println("Number is armstrong");
        else 
            System.out.println(("Number is not armstrong"));
    }
}
