package Day19_1.Collection.Set;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NumUniqueValue1 {
    public static void main (String [] args){
        List<Integer> list = List.of(3, 7, 3, -1, 2, 3, 7, 2, 15, 15);
        System.out.println("Tổng số không lặp lại là: " + numUniqueValues(list));
    }
    public static int numUniqueValues (List<Integer> list) {
        Set<Integer> set = new HashSet<>(list);

        return set.size();
    }
}