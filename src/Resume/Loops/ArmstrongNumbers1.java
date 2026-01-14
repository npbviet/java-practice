package Resume.Loops;

import java.util.*;

public class ArmstrongNumbers1 {
    public static void main (String[] args) {
        Scanner console = new Scanner (System.in);
        System.out.print("Type the digits of number: ");
        armstrongNumbers(console.nextInt());
    }
    public static void armstrongNumbers (int n) {
        if (n <= 0) {
            return;
        }

        int start = (int) Math.pow(10, n-1);
        int end = (int) Math.pow(10, n) - 1;

        if (n == 1) {
            start = 0;
        }

        for (int i = start; i <= end; i++){
            if (isAmstrong(i, n)) {
                System.out.print(i + " ");
            }
        }
    }
    public static boolean isAmstrong (int i, int n){
        int sum = 0;
        int num = i;
        while (num > 0){
            int digit = num % 10;
            sum += (int) Math.pow(digit, n);
            num = num/10;
        }
        return sum == i;
    }
}