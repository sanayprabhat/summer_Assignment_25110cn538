
import java.util.Scanner;


public class question_31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int row = sc.nextInt();
        
        for(int i= 1;i<=row;i++)
        {
            for(char j='A';j<'A' + i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }    
}
