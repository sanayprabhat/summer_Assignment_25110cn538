import java.util.Scanner;

public class question_48 {
    static boolean perfect(int n)
    {
        int sum =0;
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                sum+= i;
            }
        }
        if(sum==n)
            return true;
        else
            return false;
    }    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n= sc.nextInt();

        if(perfect(n))
            System.out.println("The number is perfect");
        else
            System.out.println("The number is not perfect");
    }
}
