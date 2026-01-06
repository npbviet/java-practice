package Day6_1.Strings;

import java.util.Scanner;

public class AddCommas1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter your string numbers: ");
        String a = console.next();
        System.out.println(addCommas(a));
    }

    public static String addCommas(String a) {
        String result = "";
        int count = 0;

        for (int i = a.length() - 1; i >= 0; i--) {
            result = a.charAt(i) + result;
            count++;

            if (count > 0 && count % 3 == 0 && count <= (a.length() - 1)){
                result = "," + result;
            }
        }

        return result;
    }
}
