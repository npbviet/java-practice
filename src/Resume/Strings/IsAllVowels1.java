package Resume.Strings;

public class IsAllVowels1 {
    public static void main (String[] args) {

        System.out.println(isAllVowels("banana"));
    }
    public static boolean isAllVowels(String s) {
        for (int i = 0; i < s.length(); i++) {
            String letter = s.substring(i, i + 1);
            if (!isVowel(letter)) {
                return false;
            }
        }
        return true;
    }
    public static boolean isVowel(String s) {
        String letter = s.toLowerCase();
        return letter.equals("a") || letter.equals("e") || letter.equals("i") ||
                letter.equals("o") || letter.equals("u");
    }
}
