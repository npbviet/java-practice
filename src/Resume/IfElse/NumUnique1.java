package Resume.IfElse;

import java.util.Scanner;

public class NumUnique1 {
    public static void main(String[] args) {
        System.out.print("Enter your number: ");
        Scanner console = new Scanner(System.in);
        int a = console.nextInt();
        int b = console.nextInt();
        int c = console.nextInt();

        System.out.println("There are only" + numUnique(a, b, c) + "unique numbers  = ");
    }

    public static int numUnique(int a, int b, int c) {
        int count = 1;

        if (b != a) {
            count++;
        }
        if (c != a && c != b) {
            count++;
        }

        return count;
    }
}