import java.util.Scanner.*;
import java.util.*;

public class Student2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // Random rand = new Random();
        int limit = 3;
        int count = 0;
        while (count < limit) {
            System.out.println(" \n\n GREETINGS FROM THE NUMBER GAME  ");
            sc.nextLine();
            System.out.println(" \n WELCOME TO THE GAME");
            sc.nextLine();
            System.out.println("\nLET'S START OUR NUMBER GAME");
            sc.nextLine();
            System.out.println("\n YOU WILL GET THREE ROUNDS FOR THIS GAME , SO  BEST OF LUCK !! \n");
            System.out.println("\n\nGUESS A NUMBER FROM 1 to 100 ");
            int num1 = sc.nextInt();

            if (num1 > 100) {
                System.out.println("INVALID CHOICE");
            } else {
                System.out.println("GOOD CHOICE BUT THE NUMBER IS :-  ");
            }

            // int randomnumber = read.nextInt(101);
            // System.out.println("");

            int randomNumber = (int) (Math.random() * 101);
            System.out.println("" + randomNumber);

            if (randomNumber == num1) {
                System.out.println(" \nEUREKA , YOU HAVE DONE IT ");
            }

            else {
                System.out.println("\nTRY AGAIN !!");
            }

            System.out.println("THIS WAS ROUND NUMBER " + "" + (count + 1));
            count++;

        }

    }
}