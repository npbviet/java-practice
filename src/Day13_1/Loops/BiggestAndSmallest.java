package Day13_1.Loops;

import java.util.Scanner;

public class BiggestAndSmallest {
    static int max;
    static int min;

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Number of numbers? ");
        int n = console.nextInt();

        if (n < 1) {
            System.out.print("Please type the number > 0");
            return;
        } else {
            checkMinMax(n, console);
            System.out.println("Biggest = " + max);
            System.out.println("Smallest = " + min);
        }
    }

    public static void checkMinMax(int n, Scanner console) {
        for (int i = 1; i <= n; i++) {
            System.out.print("Number " + i + ": ");
            int num = console.nextInt();

            if (i == 1) {
                min = num;
                max = num;
            } else {
                if (num > max) {
                    max = num;
                }
                if (num < min) {
                    min = num;
                }
            }
        }
    }
}