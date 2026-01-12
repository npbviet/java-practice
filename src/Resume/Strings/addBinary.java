package Resume.Strings;

import java.util.*;

public class addBinary {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Số nhị phân thứ nhất: ");
        int a = decimalOf(console.nextInt());

        System.out.print("Số nhị phân thứ hai: ");
        int b = decimalOf(console.nextInt());

        int c = a + b;
        String d = binaryOf(c);
        System.out.printf("Tổng:  %s (%d + %d = %d)%n", d, a, b, c);
    }

    public static int decimalOf(int binaryNum) {
        int decimalNum = 0;
        int x = 0;
        while (binaryNum > 0) {
            int y = binaryNum%10;
            decimalNum += y*Math.pow(2, x);
            binaryNum = binaryNum/10;
            x++;
        }
        return decimalNum;
    }

    public static String binaryOf(int num) {
        if (num == 0) return "0";

        StringBuilder binary = new StringBuilder();
        while (num > 0) {
            int x = num%2;
            binary.append(x);
            num = num / 2;
        }
        return binary.reverse().toString();
    }
}
