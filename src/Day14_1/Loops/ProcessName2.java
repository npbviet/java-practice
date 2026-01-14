package Day14_1.Loops;

import java.util.*;

public class ProcessName2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String fullPath = "";

        while (true) {
            System.out.print("Type your name: ");
            fullPath = console.nextLine();

            if (fullPath.length() >= 5 && fullPath.contains(" ")) {
                break;
            }
            System.out.println("Error, must be at least 5 chars with a space.");
        }

        int spaceIndex = fullPath.indexOf(" ");
        String first = fullPath.substring(0, spaceIndex);
        String last = fullPath.substring(spaceIndex + 1);
        String name = last + ", " + first.charAt(0) + ".";

        System.out.println("Your name is: " + name);
    }
}