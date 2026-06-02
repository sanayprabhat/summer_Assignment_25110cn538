import java.util.Scanner;
public class Sum_of_digits
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int temp, sum =0;
        while(n!=0)
        {
            temp = n %10;
            sum += temp;
            n/=10;
        }
        System.out.println("The sum of digits of the number is = " + sum);
    }
}