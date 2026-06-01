import java.util.*;
public class Sum_of_N_Natural_Number
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number N: ");
        int N = sc.nextInt();
        int sum = (N*(1+N))/2;
        System.out.println("The sum of first N natural numbers is: " + sum);
    }
}