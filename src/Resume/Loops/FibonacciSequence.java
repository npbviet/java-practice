package Resume.Loops;

import java.util.*;

public class FibonacciSequence {
    public static void main(String[] args) {
        System.out.println("This program lists the Fibonacci sequence.");
        Scanner console = new Scanner(System.in);
        System.out.print("Max value? ");

        FibonacciConstant(console.nextInt());

    }

    public static void FibonacciConstant(int MAX_TERM_VALUE) {
        int term = 0;
        int x = 0;
        int y = 1;

        System.out.print("0");
        System.out.print(", 1");
        while ((x +y) <= MAX_TERM_VALUE) {
            term = x + y;
            x = y;
            y = term;
            System.out.printf(", %d", term);
        }
    }
}
