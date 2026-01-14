package Resume.Strings;

import java.util.Scanner;

public class CrazyCaps1 {
    public static void main (String [] args) {
        Scanner console = new Scanner (System.in);
        System.out.print("Enter your string: ");
        String s = console.nextLine();

        System.out.println(crazyCaps(s));
    }

    public static String crazyCaps(String s) {
        String result = "";

        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if (i % 2 == 0) {
                result += Character.toLowerCase(c);
            } else {
                result += Character.toUpperCase(c);
            }
        }
        return result;
    }
}
