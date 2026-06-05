
import java.util.Scanner;

public class Stroong_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        int m =n, temp =0, sum =0;
        while(m!=0)
        {
            int fact = 1;
            temp = m%10;
            for(int i =1;i<=temp;i++)
            {
                fact *= i;
            }
            sum += fact;
            m/=10;
        }
        if(sum == n)
            System.out.println("The number is strong number");
        else
            System.out.println("The number is not strong number");
    }    
}
