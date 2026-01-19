package Day19_1.Collection.Set;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NumInCommon1 {
    public static void main (String [] args){
        List<Integer> list1 = List.of(3, 7, 3, -1, 2, 3, 7, 2, 15, 15);
        List<Integer> list2 = List.of(-5, 15, 2, -1, 7, 15, 36);
        System.out.println("Số trùng là: " + numInCommon(list1, list2));
    }
    public static int numInCommon (List<Integer> list1, List<Integer> list2) {
        Set<Integer> set1 = new HashSet<>(list1);
        Set<Integer> set2 = new HashSet<>(list2);
        int count = 0;

        for (int num : set1) {
            if (set2.contains(num)) {
                count++;
            }
        }

        return count;
    }
}