package Day30_12.Parameters;

import java.util.Scanner;

public class BMI {

    double weight; 
    double height;

    public BMI(double height, double weight) {
        this.weight = weight;
        this.height = height;
    }


    public static void main(String[] args) {
        System.out.println("This program reads data for two people");
        System.out.println("and computes their body mass index (BMI).");
        System.out.println();

        Scanner console = new Scanner(System.in);

        System.out.println("Person 1's information:");
        System.out.print("height (in inches)? ");
        double h1 = console.nextDouble();
        System.out.print("weight (in pounds)? ");
        double w1 = console.nextDouble();

        BMI p1 = new BMI(h1, w1);

        System.out.printf("BMI = %.1f%n", p1.getBMI());
        System.out.println(p1.calClass(p1.getBMI()));
        System.out.println();

        System.out.println("Person 2's information:");
        System.out.print("height (in inches)? ");
        double h2 = console.nextDouble();
        System.out.print("weight (in pounds)? ");
        double w2 = console.nextDouble();

        BMI p2 = new BMI(h2, w2);

        System.out.printf("BMI = %.1f%n", p2.getBMI());
        System.out.println(p2.calClass(p2.getBMI()));
        System.out.println();

        System.out.println("Have a nice day!");

    }

    public double getBMI() {
        return (weight / (height * height)) * 703;
    }

    public String calClass(double x ) {
        if (x < 18.5) {
            return ("Class 1");
        }
        else if (x >= 18.5 && x < 25) {
            return ("Class 2");
        }
        else if (x >= 25 && x < 30) {
            return ("Class 3");
        } else {
            return ("Class 4");
        }
    }
}
