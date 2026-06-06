
import java.util.Scanner;


public class x_power_n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        System.out.println("Enter power: ");
        int pow = sc.nextInt();

        int res =1;
        for(int i =1;i<=pow;i++)
        {
            res *= n;
        }
        System.out.println("Output = "+ res);
    }    
}
