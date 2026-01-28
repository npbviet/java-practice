package Resume.Collection.Map;

import java.util.*;
import java.io.*;

public class FriendList1 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner console = new Scanner(System.in);
        System.out.println("--- Friend List Program ---");
        System.out.print("Input file name (e.g., buddies.txt): ");

        String fileName = console.nextLine();

        TreeMap<String, TreeSet<String>> result = friendList(fileName);
        System.out.println("Final Friend Map:");
        System.out.println(result);
    }

    public static TreeMap<String, TreeSet<String>> friendList(String fileName) throws FileNotFoundException {
        TreeMap<String, TreeSet<String>> friendsMap = new TreeMap<>();
        Scanner fileScanner = new Scanner(new File(fileName));

        while (fileScanner.hasNextLine()) {
            String line = fileScanner.nextLine();
            if (line.trim().isEmpty()) continue;

            String[] names = line.split("\\s+");
            if (names.length < 2) continue;

            String person1 = names[0];
            String person2 = names[1];

            addFriend(friendsMap, person1, person2);
            addFriend(friendsMap, person2, person1);
        }

        fileScanner.close();
        return friendsMap;
    }

    private static void addFriend(TreeMap<String, TreeSet<String>> map, String person, String friend) {
        if (!map.containsKey(person)) {
            map.put(person, new TreeSet<>());
        }
        map.get(person).add(friend);
    }
}