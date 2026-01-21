package Resume.Collection.Set;

import java.util.*;

public class HappyNumber1 {
    public static void main (String [] args){
        Scanner console = new Scanner (System.in);
        System.out.print("Type your number: ");
        int n = console.nextInt();
        if (isHappyNumber(n)){
            System.out.println("Your number is Happy number");
        } else {
            System.out.println("Your number isn't Happy number");
        }
    }
    public static boolean isHappyNumber(int n) {
        Set<Integer> seen = new HashSet<>();

        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            n = getNext(n);
        }

        return n == 1;
    }

    private static int getNext(int n) {
        int totalSum = 0;
        while (n > 0) {
            int digit = n % 10;
            totalSum += digit * digit;
            n = n / 10;
        }
        return totalSum;
    }
}