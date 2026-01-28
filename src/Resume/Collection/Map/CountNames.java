package Resume.Collection.Map;

import java.util.*;

public class CountNames {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        HashMap<String, Integer> mapCount = new HashMap<>();

        while (true){
            System.out.print("Enter name: ");
            String name = console.nextLine().trim();

            if (name.isEmpty()) {
                break;
            }

            if (mapCount.containsKey(name)){
                int count = mapCount.get(name);
                count++;
                mapCount.put(name, count);
            }
            else {
                mapCount.put(name, 1);
            }
        }
        for (String key : mapCount.keySet()){
            System.out.printf("Entry [%s] has count %d%n", key, mapCount.get(key));
        }

    }
}
