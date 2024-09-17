import java.util.*;
import java.util.Scanner.*;

public class student {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your marks in Subject 1 ");
        int sub1 = sc.nextInt();

        System.out.println("Enter your marks in Subject 2");
        int sub2 = sc.nextInt();

        System.out.println("Enter your marks in Subject 3");
        int sub3 = sc.nextInt();

        System.out.println("Enter your marks in Subject 4");
        int sub4 = sc.nextInt();

        System.out.println("Enter your marks in Subject 5");
        int sub5 = sc.nextInt();

        int sum = (sub1 + sub2 + sub3 + sub4 + sub5) / 5;
        System.out.println("\n\n The average percentage of marks is-  " + sum + " %");

        int sum1 = (sub1 + sub2 + sub3 + sub4 + sub5);
        System.out.println("  \n\n The total marks obtained by the student is " + sum1);

        if (sum > 80) {
            System.out.println("\n YOUR GRADE IS A \n YOU ARE PASSED AND PROMOTED ");
        } else if (sum > 50) {
            System.out.println("\n YOUR GRADE IS B \n YOU ARE PASSED AND PROMOTED ");
        } else if (sum > 30) {
            System.out.println("\n YOUR GRADE IS C \n YOU ARE PASSED AND PROMOTED");
        } else {
            System.out.println("\n FAILED !");
        }

    }
}