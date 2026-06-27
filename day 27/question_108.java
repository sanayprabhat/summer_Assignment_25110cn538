import java.util.Scanner;

public class question_108 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Roll Number: ");
        int roll = sc.nextInt();
        System.out.print("Enter marks in English: ");
        int english = sc.nextInt();
        System.out.print("Enter marks in Maths: ");
        int maths = sc.nextInt();
        System.out.print("Enter marks in Science: ");
        int science = sc.nextInt();
        System.out.print("Enter marks in Computer: ");
        int computer = sc.nextInt();
        System.out.print("Enter marks in Hindi: ");
        int hindi = sc.nextInt();
        int total = english + maths + science + computer + hindi;
        double percentage = total / 5.0;
        char grade;
        if (percentage >= 90)
            grade = 'A';
        else if (percentage >= 75)
            grade = 'B';
        else if (percentage >= 60)
            grade = 'C';
        else if (percentage >= 40)
            grade = 'D';
        else
            grade = 'F';
        System.out.println("\n Marksheet..");
        System.out.println("Name       : " + name);
        System.out.println("Roll No.   : " + roll);
        System.out.println("Total Marks: " + total + "/500");
        System.out.println("Percentage : " + percentage + "%");
        System.out.println("Grade      : " + grade);
    }
}