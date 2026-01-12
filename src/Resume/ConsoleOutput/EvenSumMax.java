package Resume.ConsoleOutput;

import java.util.Scanner;

public class EvenSumMax {
    static int sumEven = 0;
    static int maxEven = 0;
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("how many integers? ");
        int count = console.nextInt();

        askIntegers(count, console);

        System.out.println("even sum = " + sumEven);
        System.out.println("even max = " + maxEven);
    }

    public static void askIntegers (int num, Scanner console) {
        for (int i = 1; i <= num; i++) {
            System.out.print("next integer? ");
            int nextNum = console.nextInt();
            calNum(nextNum);
        }
    }

    public static void calNum (int num) {
        if (num % 2 == 0) {
            sumEven += num;
            if (num > maxEven) {
                maxEven = num;
            }
        }
    }
}

