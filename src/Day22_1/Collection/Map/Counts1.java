package Day22_1.Collection.Map;

import java.util.*;

public class Counts1 {
    public static void main(String[] args){
        List<Integer> s1 = List.of(4, -2, 3, 9, 4, 17, 5, 29, 14, 87, 4, -2, 100);
        Set<Integer> s2 = new HashSet<>(List.of(-2, 4, 7, 29));

        System.out.println(counts(s1,s2));
    }
    public static Map<Integer, Integer> counts (List<Integer> s1, Set<Integer> s2){
        HashMap<Integer, Integer> mapCount = new HashMap<>();

        for (Integer value : s2) {
            int count = 0;

            for (Integer num : s1) {
                if (value.equals(num)) {
                    count++;
                }
            }
            mapCount.put(value,count);
        }

        return mapCount;
    }
}
