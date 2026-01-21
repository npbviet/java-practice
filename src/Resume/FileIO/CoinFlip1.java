package Resume.FileIO;

import java.util.*;
import java.io.*;

public class CoinFlip1 {
    public static void main (String [] args) throws FileNotFoundException {
        coinFlip ("src/Day19_1/FileIO/coins.txt");
    }
    public static void coinFlip(String fileName) throws FileNotFoundException {
        Scanner console = new Scanner(new File(fileName));

        int heads = 0;
        int totalCount = 0;

        while (console.hasNext()) {
            String input = console.next().toLowerCase();
            totalCount++;
            if (input.equals("h") || input.equals("heads")) {
                heads++;
            }
        }
        console.close();

        double percentage = (double) heads * 100 / totalCount;
        int roundedPercent = (int) Math.round(percentage);

        System.out.printf("%d heads (%d%%)%n", heads, roundedPercent);

        if (roundedPercent >= 50) {
            System.out.println("You win!");
        } else {
            System.out.println("You lose!");
        }
    }
}