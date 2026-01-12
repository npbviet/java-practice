package Resume.ConsoleOutput;

public class BoughtMeACat {
    public static void main(String[] args) {
        String[] animals = {"cat", "hen", "duck", "goose", "sheep", "pig"};
        String[] sounds = {
                "Cat goes fiddle-i-fee.",
                "Hen goes chimmy-chuck, chimmy-chuck,",
                "Duck goes quack, quack,",
                "Goose goes hissy, hissy,",
                "Sheep goes baa, baa,",
                "Pig goes oink, oink,"
        };

        for (int i = 0; i < animals.length; i++) {
            System.out.println("Bought me a " + animals[i] + " and the " + animals[i] + " pleased me,");
            System.out.println("I fed my " + animals[i] + " under yonder tree.");

            for (int j = i; j >= 0; j--) {
                System.out.println(sounds[j]);
            }
            System.out.println();
        }
    }
}