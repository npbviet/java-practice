package Day24_12.Loops;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Max value? ");

        renderResults(console.nextInt());

    }

    public static void renderResults(int MAX_VALUE) {
        for ( int i = 1; i <= MAX_VALUE; i++) {
            if (i % 15 == 0) {
                System.out.print("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.print("Fizz");
            } else if (i % 5 == 0) {
                System.out.print("Buzz");
            } else {System.out.printf("%d", i);}

            if (i % 20 == 0) {
                System.out.println();
            } else if (i < MAX_VALUE) {
                System.out.print(" ");
            }
        }
    }
}
