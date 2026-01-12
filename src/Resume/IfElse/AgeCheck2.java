package Resume.IfElse;

import java.util.Scanner;

public class AgeCheck2 {
    public static void main(String[] args) {
        System.out.print("Your age? ");
        Scanner console = new Scanner(System.in);
        int myAge = console.nextInt();
        message(myAge);
    }

    public static void message(int age) {
        if (age >= 21) {
            System.out.println("I can legally purchase alcohol!");
        } else if (age >= 17) {
            System.out.println("I can purchase a ticket to an R-rated movie.");
        } else if (age >= 16) {
            System.out.println("I can get my driver's license!");
        }
    }
}