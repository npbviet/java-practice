package Day15_1.Algorithms;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BootCode2 {
    public static void main (String [] args) throws FileNotFoundException {
        int result = bootCode2 ("src/Day15_1/Algorithms/code.txt");
        System.out.println("\nYour value is: " + result);
    }
    public static int bootCode2 (String fileName) throws FileNotFoundException {
        Scanner input = new Scanner(new File(fileName));
        List<String> saveFile = new ArrayList<>();
        while (input.hasNextLine()) {
            saveFile.add(input.nextLine().trim());
        }
        input.close();

        for (int i = 0; i < saveFile.size(); i++){
            String originalLine = saveFile.get(i);
            if (originalLine.contains("acc")){
                continue;
            }
            String modifiedLine;
            if (originalLine.contains("nop")) {
                modifiedLine = originalLine.replace("nop", "jmp");
            } else {
                modifiedLine = originalLine.replace("jmp", "nop");
            }

            saveFile.set(i, modifiedLine);

            int[] result = runCode(saveFile);
            int terminated = result[1];
            if (terminated == saveFile.size()) {
                return (int) result[0];
            } else {
                saveFile.set(i, originalLine);
            }
        }
        return -1;
    }

    public static int [] runCode (List<String> file) {
        int accumulator = 0;
        int lineNum = 0;

        boolean[] visited = new boolean[file.size()];

        while (lineNum >= 0 && lineNum < file.size()) {
            if(visited[lineNum]) {
                return new int[]{accumulator, lineNum};
            }

            visited[lineNum] = true;

            String[] line = file.get(lineNum).split("\\s+");
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

        return new int [] {accumulator, lineNum};
    }
}