package Day19_1.FileIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FlipAndReverseLine1 {
    public static void main (String [] args)  throws FileNotFoundException {
//        Scanner console = new Scanner(System.in);
//        File file;
//        while (true) {
//            System.out.print("Input file name? ");
//            String name = console.nextLine();
//            file = new File(name);
//            if (file.exists()) {
//                break;
//            }
//            System.out.println("Unable to open that file.  Try again.");
//        }

        System.out.println("Your file has " + flipAndReverseLine() + " lines");
    }
    public static int flipAndReverseLine() throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        File file;
        while (true) {
            System.out.print("Input file name? ");
            String name = input.nextLine();
            file = new File(name);
            if (file.exists()) {
                System.out.println();
                break;
            }
            System.out.println("Unable to open that file.  Try again.");
        }

        Scanner console = new Scanner (file);
        int line = 0;
        while (console.hasNextLine()){
            line++;
            String lineA = console.nextLine();
            if (console.hasNextLine()) {
                line++;
                String lineB = console.nextLine();
                System.out.println(reverse(lineB.toUpperCase()));
                System.out.println(reverse(lineA.toLowerCase()));
            } else {
                System.out.println(reverse(lineA.toUpperCase()));
            }
        }
        return line;
    }
    public static String reverse (String s) {
        String result = "";
        for (int i = s.length() - 1; i >= 0; i--){
            result += s.charAt(i);
        }
        return result;
    }
}