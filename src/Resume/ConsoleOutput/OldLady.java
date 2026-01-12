package Resume.ConsoleOutput;

public class OldLady {
    public static void main(String[] args) {
        verseFly();
        verseSpider();
        verseBird();
        verseCat();
        verseDog();
        verseHorse();
    }

    public static void verseFly() {
        System.out.println("There was an old lady who swallowed a fly.");
        flyEnding();
        System.out.println();
    }

    public static void verseSpider() {
        System.out.println("There was an old lady who swallowed a spider,");
        System.out.println("That wriggled and iggled and jiggled inside her.");
        swallow("spider", "fly");
        flyEnding();
        System.out.println();
    }

    public static void verseBird() {
        System.out.println("There was an old lady who swallowed a bird,");
        System.out.println("How absurd to swallow a bird.");
        swallow("bird", "spider");
        swallow("spider", "fly");
        flyEnding();
        System.out.println();
    }

    public static void verseCat() {
        System.out.println("There was an old lady who swallowed a cat,");
        System.out.println("Imagine that to swallow a cat.");
        swallow("cat", "bird");
        swallow("bird", "spider");
        swallow("spider", "fly");
        flyEnding();
        System.out.println();
    }

    public static void verseDog() {
        System.out.println("There was an old lady who swallowed a dog,");
        System.out.println("What a hog to swallow a dog.");
        swallow("dog", "cat");
        swallow("cat", "bird");
        swallow("bird", "spider");
        swallow("spider", "fly");
        flyEnding();
        System.out.println();
    }

    public static void verseHorse() {
        System.out.println("There was an old lady who swallowed a horse,");
        System.out.println("She died of course.");
    }

    public static void swallow(String eater, String caught) {
        System.out.println("She swallowed the " + eater + " to catch the " + caught + ",");
    }

    public static void flyEnding() {
        System.out.println("I don't know why she swallowed that fly,");
        System.out.println("Perhaps she'll die.");
    }
}
