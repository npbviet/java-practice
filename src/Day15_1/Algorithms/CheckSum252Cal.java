package Day15_1.Algorithms;

import java.io.*;
import java.util.*;

public class CheckSum252Cal {
    public static void main(String[] args) throws FileNotFoundException {
        String filePath = "src/Day15_1/Algorithms/number.txt";

        List<Long> list = getAllNumbers(filePath);

        long corruptedNumber = checkSum25(list);

        long result = checkSum252(list, corruptedNumber);

        System.out.println("Corrupted Number: " + corruptedNumber);
        System.out.println("Final Result (Min + Max): " + result);
    }

    public static List<Long> getAllNumbers(String fileName) throws FileNotFoundException {
        Scanner input = new Scanner(new File(fileName));
        List<Long> list = new ArrayList<>();
        while (input.hasNextLong()) {
            list.add(input.nextLong());
        }
        input.close();
        return list;
    }

    public static long checkSum25(List<Long> list) {
        for (int i = 25; i < list.size(); i++) {
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
            if (!foundPair) return target;
        }
        return -1;
    }

    public static long checkSum252(List<Long> list, long target) {
        int start = 0;
        long currentSum = 0;

        for (int end = 0; end < list.size(); end++) {
            currentSum += list.get(end);

            while (currentSum > target && start < end) {
                currentSum -= list.get(start);
                start++;
            }

            if (currentSum == target && end > start) {
                List<Long> subList = list.subList(start, end + 1);

                long min = Collections.min(subList);
                long max = Collections.max(subList);

                return min + max;
            }
        }
        return -1;
    }
}