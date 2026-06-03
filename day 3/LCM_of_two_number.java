import java.util.Scanner;
public class LCM_of_two_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int flag =0;
        for(int i=2;i<Math.min(a, b); i++)
        {
            if(a%i==0 && b%i==0)
            {
                System.out.println("LCM = " +i);
                flag++;
                break;
            }
        }
        if(flag==0)
        {
            System.out.println("LCM does not exist");
        }
    }
}
