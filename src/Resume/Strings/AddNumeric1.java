package Resume.Strings;

import java.util.Scanner;

public class AddNumeric1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter your 1st string numbers: ");
        String a = console.next();

        System.out.print("Enter your 2nd string numbers: ");
        String b = console.next();

        System.out.println(addNumeric(a,b));
    }

    public static String addNumeric(String s1, String s2) {
        StringBuilder result = new StringBuilder();
        int i = s1.length() - 1;
        int j = s2.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry > 0) {
            int d1 = (i >= 0) ? s1.charAt(i) - '0' : 0;
            int d2 = (j >= 0) ? s2.charAt(j) - '0' : 0;

            int sum = d1 + d2 + carry;
            result.append(sum % 10);
            carry = sum / 10;

            i--;
            j--;
        }

        return result.reverse().toString();
    }
}
