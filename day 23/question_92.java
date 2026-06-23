
import java.util.Scanner;

public class question_92 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine().toLowerCase();
        int[] count = new int[26];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                count[ch - 'a']++;
            }
        }
        int maxFreq = 0;
        char maxChar = ' ';
        for (int i = 0; i < 26; i++) {
            if (count[i] > maxFreq) {
                maxFreq = count[i];
                maxChar = (char)(i + 'a');
            }
        }
        System.out.println("Maximum occurring character: " + maxChar);
        System.out.println("Frequency: " + maxFreq);

    }    
}
