package Day15_1.Recursion;

import java.util.*;

public class CollapseSequence1 {
    public static void main (String [] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Please type your string: ");
        String s = console.next();
        System.out.print("Please type your char: ");
        Character c = console.next().charAt(0);

        System.out.println(collapseSequence(s, c));
    }

    public static String collapseSequence (String s, char c){
        if (s.length() < 2){
            return s;
        }

        if (s.charAt(0) == c && s.charAt(1) == c){
            return collapseSequence(s.substring(1), c);
        } else {
            return s.charAt(0) + collapseSequence(s.substring(1), c);
        }
    }
}