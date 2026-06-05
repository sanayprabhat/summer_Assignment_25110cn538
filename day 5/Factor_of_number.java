
import java.util.Scanner;

public class Factor_of_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        System.out.print("The factors of the number " +n +" are ");
        for(int i =1;i<=n;i++)
        {
            if(n%i==0)
                System.out.print(i + " ");
        }
    }   
}
