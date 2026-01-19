package Day19_1.Collection.Set;

import java.util.*;

public class MaxLength1 {
    public static void main (String [] args){
        Set<String> set1 = new HashSet<>(List.of("apple", "banana", "cherry", "watermelon"));
        System.out.println("Độ dài lớn nhất: " + maxLength(set1));
    }
    public static int maxLength (Set<String> set) {
        int max = 0;

        for (String s : set) {
            if (s.length() > max) {
                max = s.length();
            }
        }

        return max;
    }
}