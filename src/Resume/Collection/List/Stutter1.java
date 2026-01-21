package Resume.Collection.List;

import java.util.ArrayList;
import java.util.List;

public class Stutter1 {
    public static void main (String [] args) {
        List<Integer> list1 = new ArrayList<>(List.of(1, 8, 19, 4, 17));
        List<Integer> list2 = stutter(list1);

        System.out.println(list1);
        System.out.println(list2);
    }
    public static List<Integer> stutter(List<Integer> list) {
        for (int i = 0; i < list.size(); i += 2) {
            int value = list.get(i);

            list.add(i, value);
        }

        return list;
    }
}