package Resume.ConsoleOutput;

import java.util.*;

public class Receipt2 {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        System.out.print("What was the meal cost? $");
        int subTotal = console.nextInt();
        calBill(subTotal);
    }

    public static void calBill (int num) {
        double tax = num * 0.08;
        double tip = num * 0.15;
        double total = num + tax + tip;

        System.out.println("Subtotal: " + num);
        System.out.println("Tax: " + tax);
        System.out.println("Tip: " + tip);
        System.out.println("Total: " + total);
    }
}