import java.util.Scanner;
public class GCD_of_two_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int flag=0;
        for(int i= Math.min(a, b); i>=1; i--)
        {
            if(a%i==0 && b%i==0)
            {
                System.out.println("GCD = " + i);
                flag++;
                break;
            }
        }
        if(flag==0)
            System.out.println("GCD does not exist");
    }
}
