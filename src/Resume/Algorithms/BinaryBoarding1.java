package Resume.Algorithms;

import java.io.*;
import java.util.*;

public class BinaryBoarding1 {
    public static void main (String [] args) throws FileNotFoundException {
        int result = binaryBoarding ("src/Day15_1/Algorithms/boarding.txt");
        System.out.println("\nThe highest seat ID is: " + result);
    }
    public static int binaryBoarding(String fileName) throws FileNotFoundException {
        Scanner input = new Scanner(new File(fileName));
        int maxID = 0;
        while (input.hasNextLine()) {
            String line = input.nextLine().trim();
            if (line.length() != 10){
                continue;
            }
            String binaryString = line.replace("F","0").replace("B","1")
                    .replace("L","0").replace("R","1");

            int row = Integer.parseInt(binaryString.substring(0, 7), 2);
            int col = Integer.parseInt(binaryString.substring(7), 2);

            int seatID = (row * 8) + col;
            if (seatID > maxID) {
                maxID = seatID;
            }
        }
        return maxID;
    }
}