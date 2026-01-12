package Day12_1.Strings;

import java.util.*;

public class CanMakePalindrome1 {
    public static void main (String [] args) {
        Scanner console = new Scanner (System.in);
        System.out.print("Enter your string: ");
        String value = console.next();

        if (canMakePalindrome(value)){
            System.out.println("Your string is Palindrome");
        } else {
            System.out.println("Your string isn't Palindrome");
        }
    }

    public static boolean canMakePalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) == s.charAt(right)) {
                left++;
                right--;
            } else {
                return isPalindrome(s, left + 1, right) || isPalindrome(s, left, right - 1);
            }
        }
        return true;
    }

    public static boolean isPalindrome (String s, int i, int j){
        while (i < j){
            if (s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
