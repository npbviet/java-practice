package Day23_12.Loops;

import java.util.*;

public class ComputeSumOfDigits {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Type an integer: ");
        calSumOfDigits(console.nextInt());
    }

    public static void calSumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num = num / 10;
        }
        System.out.println("Digit sum is " + sum);
    }

}
