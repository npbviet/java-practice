package Resume.Loops;

import java.util.*;

public class NthDigit1 {
    public static void main (String []args){
        Scanner console = new Scanner(System.in);
        System.out.println("Please enter your nth number: ");

        System.out.println("Your number is: " + nthDigit(console.nextInt()));
    }
    public static int nthDigit(int n) {
        long length = 1;
        long count = 9;
        long start = 1;

        while (n > length * count) {
            n -= length * count;
            length++;
            count *= 10;
            start *= 10;
        }

        start += (n - 1) / length;
        String s = Long.toString(start);

        return Character.getNumericValue(s.charAt((int)((n - 1) % length)));
    }
}