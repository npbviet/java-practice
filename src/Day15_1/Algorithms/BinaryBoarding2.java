package Day15_1.Algorithms;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BinaryBoarding2 {
    public static void main (String [] args) throws FileNotFoundException {
        int result = binaryBoarding2 ("src/Day15_1/Algorithms/boarding.txt");
        System.out.println("\nThe highest seat ID is: " + result);
    }
    public static int binaryBoarding2(String fileName) throws FileNotFoundException {
        Scanner input = new Scanner(new File(fileName));
        int maxID = 127*8 + 8 - 1;
        boolean[] exists = new boolean[maxID + 1];
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
            exists[seatID] = true;
        }

        input.close();

        for (int i = 8; i < (maxID - 8); i++){
            if (!exists[i] && exists[i - 1] && exists[i + 1]){
                return i;
            }
        }
        return -1;
    }
}