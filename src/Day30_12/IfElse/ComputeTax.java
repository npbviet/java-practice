package Day30_12.IfElse;

import java.util.Scanner;

public class ComputeTax {
    public static void main(String[] args) {
        System.out.print("Enter your salary: ");

        Scanner console = new Scanner(System.in);
        double a = calTax(console.nextInt());
        System.out.printf("Your tax is : %.2f%n", a);
    }
    public static double calTax(double salary) {
        double tax = 0;

        if (salary <= 7150) {
            tax = salary* 0.1;;
        } else if (salary <= 29050) {
            tax = 715 + (salary - 7150)* 0.15;
        } else if (salary <= 70350) {
            tax = 4000 + (salary - 29050) * 0.25;
        } else {
            tax = 14325 + (salary - 70350) * 0.28;
        }

        return tax;
    }


}