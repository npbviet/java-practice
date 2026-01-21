package Day21_1.Strings;

import java.util.*;

public class JustifyText1 {
    public static void main (String[] args){
        justifyText("Write a method named justifyText that accepts a string " +
                "and a line width as an integer", 15);
    }
    public static void justifyText(String text, int width) {
        if (text == null || text.isEmpty()) return;

        String[] words = text.split("\\s+");
        List<String> currentLine = new ArrayList<>();
        int currentLength = 0;

        for (String word : words) {
            if (currentLength + word.length() + currentLine.size() > width) {
                printJustifiedLine(currentLine, currentLength, width);
                currentLine.clear();
                currentLength = 0;
            }
            currentLine.add(word);
            currentLength += word.length();
        }

        printLastLine(currentLine, width);
    }

    private static void printJustifiedLine(List<String> line, int wordsCharLength, int width) {
        int totalSpaces = width - wordsCharLength;
        StringBuilder sb = new StringBuilder();

        if (line.size() == 1) {
            sb.append(line.get(0));
            for (int j = 0; j < totalSpaces; j++) sb.append(" ");
        } else {
            int numGaps = line.size() - 1;
            int basicSpaces = totalSpaces / numGaps;
            int extraSpaces = totalSpaces % numGaps;

            for (int i = 0; i < numGaps; i++) {
                sb.append(line.get(i));
                int spacesToPrint = basicSpaces;

                if (extraSpaces != 0 && (i * extraSpaces + extraSpaces - 1) % numGaps < extraSpaces) {
                    spacesToPrint++;
                }

                for (int j = 0; j < spacesToPrint; j++) {
                    sb.append(" ");
                }
            }
            sb.append(line.get(numGaps));
        }
        System.out.println(sb.toString());
    }

    private static void printLastLine(List<String> line, int width) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < line.size(); i++) {
            sb.append(line.get(i));
            if (i < line.size() - 1) sb.append(" ");
        }
        System.out.println(sb.toString());
    }
}
