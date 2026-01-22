package Day22_1.Parameters;

import java.util.*;

public class Investment {
    public static void main(String[] args){
        Scanner console = new Scanner (System.in);
        System.out.println("Investor #1:");
        calInvest(console);

        System.out.println();
        System.out.println("Investor #2:");
        calInvest(console);

        System.out.println();
        System.out.println("Have a nice day!");
    }
    public static void calInvest(Scanner console){
        System.out.print("Initial amount? ");
        double amount = console.nextDouble();
        System.out.print("Interest rate%? ");
        double rate = console.nextDouble();
        System.out.print("Num. of months? ");
        int month = console.nextInt();

        double finalAmount = Math.pow((1 + rate), month)*amount;
        System.out.printf("Final amount = $%.2f\n", finalAmount);
        double profit = finalAmount - amount;
        double rateProfit = profit/amount*100;
        System.out.printf("Profit = $%.2f (%.0f%%)\n", profit, rateProfit);
        System.out.println(calCategory(rateProfit));
    }
    public static String calCategory (double x) {
        if (x > 50) {
            return "strong";
        } else if ( x <= 50 && x > 10) {
            return "medium";
        } else {
            return "weak";
        }
    }
}
