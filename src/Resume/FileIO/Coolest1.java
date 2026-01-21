package Resume.FileIO;

import java.io.*;
import java.util.*;

public class Coolest1 {
    public static void main (String [] args) throws FileNotFoundException {
        System.out.println(coolest ("src/Day19_1/FileIO/twitter.txt"));
    }
    public static String coolest(String fileName) throws FileNotFoundException {
        Scanner console = new Scanner(new File(fileName));

        Map<String, Set<String>> followersMap = new HashMap<>();
        Map<String, Integer> followerCount = new HashMap<>();

        while (console.hasNext()) {
            String follower = console.next();
            String celeb = console.next();

            if (!followersMap.containsKey(celeb)) {
                followersMap.put(celeb, new HashSet<>());
            }
            followersMap.get(celeb).add(follower);

            if (followerCount.containsKey(celeb)) {
                int count = followerCount.get(celeb);
                followerCount.put(celeb, count + 1);
            } else {
                followerCount.put(celeb, 1);
            }

            if (!followerCount.containsKey(follower)) {
                followerCount.put(follower, 0);
            }
        }
        console.close();

        String coolestPerson = "";
        int maxPopularity = -1;

        for (String person : followersMap.keySet()) {
            int currentPopularity = 0;

            for (String follower : followersMap.get(person)) {
                currentPopularity += followerCount.get(follower);
            }

            if (currentPopularity > maxPopularity) {
                maxPopularity = currentPopularity;
                coolestPerson = person;
            } else if (currentPopularity == maxPopularity) {
                if (person.compareTo(coolestPerson) < 0) {
                    coolestPerson = person;
                }
            }
        }

        return coolestPerson;
    }
}