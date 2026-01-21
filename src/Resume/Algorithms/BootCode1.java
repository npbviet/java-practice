package Resume.Algorithms;

import java.io.*;
import java.util.*;

public class BootCode1 {
    public static void main (String [] args) throws FileNotFoundException {
        int result = bootCode ("src/Day15_1/Algorithms/code.txt");
        System.out.println("\nYour value is: " + result);
    }
    public static int bootCode (String fileName) throws FileNotFoundException {
        Scanner input = new Scanner(new File(fileName));
        List<String> saveFile = new ArrayList<>();
        while (input.hasNextLine()) {
            saveFile.add(input.nextLine().trim());
        }
        input.close();

        int accumulator = 0;
        int lineNum = 0;

        boolean[] visited = new boolean[saveFile.size()];

        while (lineNum >= 0 && lineNum < saveFile.size()) {
            if(visited[lineNum]) {
                break;
            }

            visited[lineNum] = true;
            String[] line = saveFile.get(lineNum).split("\\s+");
            String action = line[0];
            int value = Integer.parseInt(line[1]);

            switch (action){
                case "nop":
                    lineNum++;
                    break;
                case "acc":
                    accumulator += value;
                    lineNum++;
                    break;
                case "jmp":
                    lineNum += value;
                    break;
            }
        }

        return accumulator;
    }
}