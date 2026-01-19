package Day19_1.Collection.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class AddStars1 {
    public static void main (String [] args) {
        ArrayList<String> words = new ArrayList<>(List.of("laughing", "out", "loud"));

        addStars(words);
        System.out.println("Sau:  " + words);
    }
    public static void addStars (ArrayList<String> list){
        for (int i = 0; i < list.size(); i += 2) {
            list.add(i, "*");
        }
        list.add("*");
    }
}