
import java.util.Scanner;

public class Armstrong_number_in_range {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter range: ");
        int range = sc.nextInt();
         for(int i =1;i<range;i++)
        {
            int temp, sum =0, count =0, m = i , g=i;
            while(m!=0)
            {
                m/=10;
                count++;
            }
            while(g!=0)
            {
                temp = g%10;
                sum+= (int)Math.pow(temp, count);
                g/=10;
            }
            if(sum == i)
                System.out.print(" " + i);
        }
    }
}
