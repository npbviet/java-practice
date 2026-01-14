package Resume.Strings;

import java.util.*;

public class CaesarCipher {
    public static void main (String [] args) {
        Scanner console = new Scanner (System.in);
        System.out.print("Your message? ");
        String mess = console.nextLine().toUpperCase();

        System.out.print("Encoding key? ");
        int key = console.nextInt();

        String result = encode(mess, key);
        System.out.println(result);
    }

    public static String encode(String message, int key) {
        String result = "";

        for (int i = 0; i < message.length(); i++) {
            char c = message.charAt(i);

            if (c >= 'A' && c <= 'Z') {
                int originalPos = c - 'A';

                int newPos = (originalPos + key) % 26;
                if (newPos < 0) {
                    newPos += 26;
                }
                result += (char) ('A' + newPos);
            } else {
                result += c;
            }
        }

        return result;
    }
}
