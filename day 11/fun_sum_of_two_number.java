import java.util.Scanner;

public class fun_sum_of_two_number {

    static int sum(int a, int b)
    {
        return a+b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a= sc.nextInt();
        int b= sc.nextInt();
        System.out.println("Sum = " +sum(a, b));
    }
}
