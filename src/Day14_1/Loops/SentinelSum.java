package Day14_1.Loops;

import java.util.*;

public class SentinelSum {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int number;
        int sum = 0;

        while (true) {
            System.out.print("Type a number: ");
            number = console.nextInt();
            if (number != -1) {
                sum += number;
            } else {
                break;
            }
        }

        System.out.println("Sum is " + sum);
    }
}