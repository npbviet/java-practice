package Day23_12.Loops;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
//        Scanner console = new Scanner(System.in);
//        System.out.print("Type max term value: ");
//
//        FibonaciConstant(console.nextInt());
          FibonaciConstant(MAX_TERM_VALUE);

    }
    public static final int MAX_TERM_VALUE = 10000;

    public static void FibonaciConstant(int MAX_TERM_VALUE) {
        int term = 0;
        int x = 0;
        int y = 1;
        System.out.println("This program lists the Fibonacci sequence.");
        System.out.println(0);
        System.out.println(1);
        while ((x +y) < MAX_TERM_VALUE) {
            term = x + y;
            x = y;
            y = term;
            System.out.println(term);
        }
    }
}
