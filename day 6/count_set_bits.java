
import java.util.Scanner;

public class count_set_bits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        int count =0;
        while(n>0)
        {
            if(n%2==1)
            {
                count++;
            }
            n/=2;
        }
        System.out.println("Number of set bits: " +count);
    }       
}
