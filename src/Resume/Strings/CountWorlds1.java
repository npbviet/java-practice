package Resume.Strings;

import java.util.Scanner;

public class CountWorlds1 {
    public static void main (String [] args) {
        Scanner console = new Scanner (System.in);
        System.out.print("Enter your string: ");
        String s = console.nextLine();

        System.out.println("Your string has: " + countWords(s) + " words");
    }

    public static int countWords(String s) {
        if (s == null || s.trim().isEmpty()) {
            return 0;
        }

        Scanner input = new Scanner(s);
        int count = 0;

        while (input.hasNext()) {
            input.next();
            count++;
        }

        return count;
    }
}
