package Resume.ConsoleOutput;

public class Receipt {
    public static void main(String[] args) {

        int subTotal = 38 + 40 + 30;
        double tax = subTotal * 0.08;
        double tip = subTotal * 0.15;
        double total = subTotal + tax + tip;

        System.out.printf("Subtotal: %d \n", subTotal);
        System.out.printf("Tax: %.2f \n", tax);
        System.out.printf("Tip: %.1f \n", tip);
        System.out.printf("Total: %.2f \n", total);
    }
}