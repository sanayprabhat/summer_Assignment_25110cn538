
import java.util.Scanner;


public class binary_to_decimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter binary number: ");
        int n = sc.nextInt();
        int dec =0, pow=0;
        while(n>0)
        {
            int temp = n%10;
            dec += temp*Math.pow(2, pow);
            pow++;
            n/=10;
        }
        System.out.println("Deciaml number = "+dec);
    }    
}
