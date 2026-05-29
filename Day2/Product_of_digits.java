import java.util.Scanner;
public class Product_of_digits
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int temp, product =1;
        while(n!=0)
        {
            temp = n %10;
            product *= temp;
            n/=10;
        }
        System.out.println("The product of digits of the number is = " + product);
    }
}