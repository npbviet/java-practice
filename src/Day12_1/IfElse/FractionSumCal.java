package Day12_1.IfElse;

import java.util.Scanner;

public class FractionSumCal {
    public static void main(String[] args) {
        System.out.print("Enter your number: ");
        Scanner console = new Scanner(System.in);
        int x = console.nextInt();

        System.out.println("Sum of your fraction = " + fractionSum(x));
    }

    public static double fractionSum(int x) {

        double sum = 0.0;

        for (int i = 1; i <= x; i++) {
            sum += 1.0 / i;
        }

        return sum;
    }
}