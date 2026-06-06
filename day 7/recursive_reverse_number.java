
import java.util.Scanner;

public class recursive_reverse_number {
    
    static int reverse =0;
    
    static int rev(int n)
    {
        if(n==0)
        return reverse;
        reverse = reverse  *10 + (n%10);
        return rev(n/10); 
    }    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Reversed number = " + rev(n));
    }
}
