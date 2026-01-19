package Day19_1.FileIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FlipCoin1 {
    public static void main (String [] args) throws FileNotFoundException {

        Scanner console = new Scanner(System.in);
        File file;
        while (true) {
            System.out.print("Input file name? ");
            String name = console.nextLine();
            file = new File(name);
            if (file.exists()) {
                break;
            }
            System.out.println("Unable to open that file.  Try again.");
        }
        Scanner input = new Scanner(file);
        flipCoins(input);
    }
    public static void flipCoins(Scanner console) throws FileNotFoundException {


        while (console.hasNextLine()) {
            String line = console.nextLine();
            Scanner lineScan = new Scanner(line);

            int heads = 0;
            int totalCount = 0;

            while (lineScan.hasNext()) {

                String input = lineScan.next().toLowerCase();
                totalCount++;
                if (input.equals("h")) {
                    heads++;
                }
            }

            double percentage = (double) heads * 100 / totalCount;
            int roundedPercent = (int) Math.round(percentage);

            System.out.printf("%d heads (%d%%)%n", heads, roundedPercent);

            if (roundedPercent >= 50) {
                System.out.println("There were more heads!");
            }
            System.out.println();
        }
        console.close();
    }
}