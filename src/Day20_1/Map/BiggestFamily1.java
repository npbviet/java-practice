package Day20_1.Map;

import java.util.*;
import java.io.*;

public class BiggestFamily1 {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner console = new Scanner(System.in);
        System.out.print("Please enter your link file: ");
        biggestFamily(console.next());
    }
    public static void biggestFamily(String fileName)throws FileNotFoundException{
        Map<String, TreeSet<String>> familyMap = new TreeMap<>();
        String biggestF = "";
        int maxFamilySize = 0;

        Scanner input = new Scanner(new File (fileName));
        while (input.hasNextLine()){
            String line = input.nextLine();

            if (line.trim().isEmpty()) continue;

            String[] parts = line.split(" ");
            String firstName = parts[0];
            String lastName = parts[1];

            if(!familyMap.containsKey(lastName)){
                familyMap.put(lastName, new TreeSet<>());
            }
            familyMap.get(lastName).add(firstName);

            int currentSize = familyMap.get(lastName).size();
            if(currentSize > maxFamilySize) {
                maxFamilySize = currentSize;
            }
        }

        for (String lastName : familyMap.keySet()){
            TreeSet<String> members = familyMap.get(lastName);
            if (members.size() == maxFamilySize) {
                System.out.print(lastName + " family:");
                for (String firstName : members) {
                    System.out.print(" " + firstName);
                }
                System.out.println();
            }
        }
    }
}
