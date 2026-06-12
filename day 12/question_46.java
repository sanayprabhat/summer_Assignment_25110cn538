
import java.util.Scanner;

public class question_46 {
    static boolean armstrong(int n)
    {
        int count=0, m=n,p=n, sum=0,temp;
        while(p>0)
        {
            p/=10;
            count++;
        }
        while(m>0)
        {
            temp = m%10;
            sum = sum+ (int)Math.pow(temp,count);
            m/=10;
        }
        if(n==sum)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n= sc.nextInt();
        
        if(armstrong(n))
            System.out.println("The number is armstrong");
        else   
            System.out.println("The number is not armstrong");
    }
}
