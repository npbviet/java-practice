package Day5_1.algorithms;

import java.util.*;
import java.io.*;

public class BaggageColor {

    public static void main(String[] args) throws FileNotFoundException {
        int result = baggageColors("src/Day5_1/algorithms/baggage.txt");
        System.out.println("Số lượng túi có thể chứa shiny gold là: " + result);
    }

    public static int baggageColors(String fileName) throws FileNotFoundException {
        Map<String, List<String>> rules = new HashMap<>();
        Scanner fileScanner = new Scanner(new File(fileName));

        while (fileScanner.hasNextLine()) {
            String line = fileScanner.nextLine();
            if (line.isEmpty()) continue;

            String[] parts = line.split(" bags contain ");
            String parent = parts[0];
            String contents = parts[1];

            List<String> children = new ArrayList<>();
            if (!contents.contains("no other bags")) {
                String[] childParts = contents.split(", ");
                for (String cp : childParts) {
                    String childName = cp.replaceAll("\\d+ ", "")
                            .replaceAll(" bag.*", "")
                            .trim();
                    children.add(childName);
                }
            }
            rules.put(parent, children);
        }

        int count = 0;
        for (String color : rules.keySet()) {
            if (!color.equals("shiny gold") && canContainGold(color, rules)) {
                count++;
            }
        }
        return count;
    }

    private static boolean canContainGold(String currentColor, Map<String, List<String>> rules) {
        List<String> children = rules.get(currentColor);

        if (children == null || children.isEmpty()) {
            return false;
        }

        if (children.contains("shiny gold")) {
            return true;
        }

        for (String child : children) {
            if (canContainGold(child, rules)) {
                return true;
            }
        }
        return false;
    }
}