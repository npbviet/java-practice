package Day15_1.Algorithms;

import java.io.*;
import java.util.*;

public class CheckSum25Cal {
    public static void main (String [] args) throws FileNotFoundException {
        long result = checkSum25 ("src/Day15_1/Algorithms/number.txt");
        System.out.println("\nYour value is: " + result);
    }
    public static long checkSum25 (String fileName) throws FileNotFoundException {
        Scanner input = new Scanner(new File(fileName));
        List<Long> list = new ArrayList<>();
        while (input.hasNextLong()) {
            list.add(input.nextLong());
        }

        input.close();
        for (int i = 25; i < list.size(); i++){
            long target = list.get(i);
            boolean foundPair = false;

            for (int j = i - 25; j < i; j++) {
                for (int k = j + 1; k < i; k++) {
                    if (list.get(j) + list.get(k) == target) {
                        foundPair = true;
                        break;
                    }
                }
                if (foundPair) break;
            }

            if (!foundPair) {
                return target;
            }
        }
        return -1;
    }
}