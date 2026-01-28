package Resume.Strings;

public class IsPalinDrome1 {
    public static void main (String[] args) {

        System.out.println(isPalindrome("banana"));
    }
    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        for (int i = 0; i < s.length()/2; i++) {
            if(s.charAt(i) != s.charAt(s.length() - i- 1)) {
                return false;
            }

        }
        return true;
    }
}
