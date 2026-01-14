package Resume.Strings;

import java.util.Scanner;

public class ContainsTwice1 {
    public static void main (String [] args) {
        Scanner console = new Scanner (System.in);
        System.out.print("Enter your string: ");
        String s = console.next();
        System.out.print("Enter your character: ");
        char key = console.next().charAt(0);

        if (containsTwice(s, key)){
            System.out.println("Your string (" + s + ") contain " + key + " twice or more");
        } else {
            System.out.println("Your string (" + s + ") doesn't contain " + key + " twice or more");
        }
    }

    public static boolean containsTwice(String s, char key) {
        int count = 0;
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == key){
                count+= 1;
            }
            if (count >= 2) {
                return true;
            }
        }
        return false;
    }
}
