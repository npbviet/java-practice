package Resume.Collection.List;

import java.util.*;

public class RemoveEvent1 {
    public static void main (String [] args) {
        List<Integer> list1 = new ArrayList<>(List.of(0, 17, 16, 7, 10, 14, 13, 12));
        List<Integer> list2 = removeEvens(list1);

        System.out.println(list1);
        System.out.println(list2);
    }
    public static List<Integer> removeEvens(List<Integer> list) {
        List<Integer> evens = new ArrayList<>();

        for (int i = list.size() - 1; i >= 0; i--) {
            int value = list.get(i);

            if (value % 2 == 0) {
                evens.add(0, list.remove(i));
            }
        }

        return evens;
    }
}