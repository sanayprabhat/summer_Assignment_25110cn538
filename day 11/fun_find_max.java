
import java.util.Scanner;

public class fun_find_max {
    static int max(int a, int b)
    {
        if(a>b)
            return a;
        else 
            return b;
    }    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();
        int b= sc.nextInt();

        System.out.println("Maximum = " + max(a, b));
    }
}
