
import java.util.Scanner;

public class question_87 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            boolean visited = false;
            for (int j = 0; j < i; j++) {
                if (str.charAt(j) == ch) {
                    visited = true;
                    break;
                }
            }
            if (!visited) {
                int count = 0;
                for (int j = 0; j < str.length(); j++) {
                    if (str.charAt(j) == ch) {
                        count++;
                    }
                }
                System.out.println(ch + " : " + count);
            }
        }
    }    
}
