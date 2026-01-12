package Resume.IfElse;

import java.util.Scanner;

public class EvenSumMaxCal {
    public static void main(String[] args) {
        evenSumMax();
    }

    public static void evenSumMax() {
        Scanner console = new Scanner(System.in);

        System.out.print("how many integers? ");
        int x = console.nextInt();

        int max = 0;
        int sum = 0;
        boolean firstEven = true;

        for (int i = 1; i <= x; i++) {
            System.out.print("next integer? ");
            int y = console.nextInt();

            if (y % 2 == 0) {
                sum += y;
                if (firstEven || y > max) {
                    max = y;
                    firstEven = false;
                }
            }
        }

        System.out.println("even sum = " + sum);
        System.out.println("even max = " + max);
    }
}