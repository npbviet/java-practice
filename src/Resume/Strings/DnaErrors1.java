package Resume.Strings;

import java.util.Scanner;

public class DnaErrors1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter your 1st DNA: ");
        String s1 = console.nextLine();
        System.out.print("Enter your 2nd DNA: ");
        String s2 = console.nextLine();

        System.out.println("Total errors: " + dnaErrors(s1, s2));
    }

    public static int dnaErrors(String s1, String s2) {
        int errors = 0;
        int maxLength = Math.max(s1.length(), s2.length());

        for (int i = 0; i < maxLength; i++) {
            boolean inS1 = i < s1.length();
            boolean inS2 = i < s2.length();

            if (!inS1 || !inS2) {
                errors += 1;
            } else {
                char c1 = Character.toUpperCase(s1.charAt(i));
                char c2 = Character.toUpperCase(s2.charAt(i));

                if (c1 == '-' || c2 == '-') {
                    errors += 1;
                } else if (!isMatch(c1, c2)) {
                    errors += 2;
                }
            }
        }
        return errors;
    }

    public static boolean isMatch(char c1, char c2) {
        return (c1 == 'A' && c2 == 'T') || (c1 == 'T' && c2 == 'A') ||
                (c1 == 'C' && c2 == 'G') || (c1 == 'G' && c2 == 'C');
    }
}