package Day19_1.Collection.ArrayList;

import java.util.*;

public class AcronymFor1 {
    public static void main (String [] args) {
        ArrayList<String> words = new ArrayList<>(List.of("laughing", "out", "loud"));

        System.out.println(acronymFor(words));
    }
    public static String acronymFor (ArrayList<String> list){
        String acronym = "";
        for(String word : list) {
            char firstLetter = Character.toUpperCase(word.charAt(0));
            acronym += firstLetter;
        }
        return acronym;
    }
}