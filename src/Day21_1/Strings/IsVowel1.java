package Day21_1.Strings;

public class IsVowel1 {
    public static void main (String[] args) {

        System.out.println(isVowel("a"));
    }
    public static boolean isVowel(String s) {
        String letter = s.toLowerCase();
        return letter.equals("a") || letter.equals("e") || letter.equals("i") ||
                letter.equals("o") || letter.equals("u");
    }
}
