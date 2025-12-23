package Day23_12.ConsoleOutput;

import java.util.Scanner;

public class InchesToCentimeters {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        System.out.println("This program converts feet and inches to centimeters.");
        System.out.print("Enter number of feet: ");
        int feetUser = console.nextInt();
        System.out.print("Enter number of inches: ");
        int inchesUser = console.nextInt();

        transferToCm(feetUser, inchesUser);
    }

    public static void transferToCm (int feetUser, int inchesUser) {
        double x = feetUser * 30.48;
        double y = inchesUser * 2.54;
        double calculate = x + y;

        System.out.printf("%dft %din = %.2fcm\n", feetUser, inchesUser,calculate);
    }
}