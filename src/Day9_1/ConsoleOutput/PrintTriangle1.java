package Day9_1.ConsoleOutput;

import java.util.Scanner;

public class PrintTriangle1 {
    public static void main(String[] args) {
        System.out.print("Enter your max line triangle: ");
        Scanner console = new Scanner(System.in);
        int num = console.nextInt();
        printTriangle(num);
    }

    public static void printTriangle(int num) {
        for (int i = 0; i < num; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}