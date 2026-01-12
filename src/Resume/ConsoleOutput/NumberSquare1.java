package Resume.ConsoleOutput;

import java.util.Scanner;

public class NumberSquare1 {
    public static void main(String[] args) {
        System.out.print("Enter your min number: ");
        Scanner console = new Scanner(System.in);
        int min = console.nextInt();
        System.out.print("Enter your max number: ");
        int max = console.nextInt();
        numberSquare(min, max);
    }

    public static void numberSquare(int min,int max) {
        int size = (max - min) + 1;

        for (int row = 0; row < size; row++) {
            int value = min + row;

            for (int col = 0; col < size; col++) {
                if (value > max) {
                    value = min;
                }
                System.out.print(value);
                value++;
            }
            System.out.println();
        }
    }
}