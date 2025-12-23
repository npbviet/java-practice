package Day23_12.ConsoleOutput;

import java.util.Scanner;

public class CalculateLine {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        System.out.println("This program calculates y coordinates for a line.");
        System.out.print("Enter slope (m): ");
        int slop = console.nextInt();
        System.out.print("Enter intercept (b): ");
        int intercept = console.nextInt();
        System.out.print("Enter x: ");
        int x = console.nextInt();

        while (x != -1) {
            calLine(slop, intercept, x);
            System.out.print("Enter x: ");
            x = console.nextInt();
        }

    }

    public static void calLine (int slop, int intercept, int x) {
        Scanner console = new Scanner(System.in);
        int y = slop*x + intercept;
        System.out.printf("f(%d) = %d\n", x, y);
    }

}