package Day1_1.IfElse;

import java.util.Scanner;

public class EvenSumMaxCal {
    public static void main(String[] args) {
        System.out.print("How many integers ");
        Scanner console = new Scanner(System.in);
        int x = console.nextInt();
        evenSumMax(console, x);
    }

    public static void evenSumMax(Scanner console,int x) {
        int i = 1;
        int max = 0;
        int sum = 0;
        while(i <= x) {
            System.out.print("next integer? ");
            int y = console.nextInt();
            if (y % 2 == 0) {
                if (max < y) { max = y;}
                sum += y;
            }

            i++;
        }
        System.out.println("even sum = " + sum);
        System.out.println("even max = " + max);
    }
}