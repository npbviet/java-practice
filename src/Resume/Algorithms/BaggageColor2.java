package Resume.Algorithms;

import java.io.*;
import java.util.*;

public class BaggageColor2 {

    public static void main(String[] args) throws FileNotFoundException {
        int result = baggageColors2("src/Day5_1/algorithms/baggage.txt");
        System.out.println("\nTổng số lượng túi bên trong túi shiny gold là: " + result);
    }

    public static int baggageColors2(String fileName) throws FileNotFoundException {
        Map<String, Map<String, Integer>> rules = new HashMap<>();
        Scanner fileScanner = new Scanner(new File(fileName));

        while (fileScanner.hasNextLine()) {
            String line = fileScanner.nextLine();
            if (line.isEmpty()) continue;

            String[] parts = line.split(" bags contain ");
            String parent = parts[0];
            String contents = parts[1];

            Map<String, Integer> children = new HashMap<>();
            if (!contents.contains("no other bags")) {
                String[] childParts = contents.split(", ");
                for (String cp : childParts) {
                    int countChildBag = Integer.parseInt(cp.replaceAll("(\\d+).*", "$1"));
                    String childName = cp.replaceAll("\\d+ ", "")
                            .replaceAll(" bag.*", "")
                            .trim();

                    children.put(childName, countChildBag);
                }
            }
            rules.put(parent, children);
        }

        return countTotalBags("shiny gold", rules);
    }

    private static int countTotalBags(String currentColor, Map<String, Map<String, Integer>> rules) {
        Map<String, Integer> children = rules.get(currentColor);

        if (children == null || children.isEmpty()) {
            return 0;
        }

        int total = 0;
        for (String childName : children.keySet()) {
            int quantity = children.get(childName);

            total += quantity + (quantity * countTotalBags(childName, rules));
        }

        return total;
    }
}