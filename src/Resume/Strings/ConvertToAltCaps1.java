package Resume.Strings;

import java.util.Scanner;

public class ConvertToAltCaps1 {
    public static void main (String [] args) {
        Scanner console = new Scanner (System.in);
        System.out.print("Enter your string: ");
        String s = console.nextLine();

        System.out.println(convertToAltCaps(s));
    }

    public static String convertToAltCaps(String s) {
        String result = "";
        int j = 0;

        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if (c == ' ') {
                result += (c);
            } else {
                if (j % 2 == 0) {
                    result += Character.toLowerCase(c);
                } else {
                    result += Character.toUpperCase(c);
                }
                j++;
            }
        }
        return result;
    }
}
