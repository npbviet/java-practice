package Resume.Parameters;

public class CoinFlip1 {
    public static void main(String[] args) {
        coinFlip(3, 'H');
    }

    public static void coinFlip(int times, char side) {
        int count = 0;
        char target = Character.toUpperCase(side);

        if (times < 0 || side != 'H'&& side != 'T'){
            System.out.println("ERROR!");
            return;
        }


        while (count < times) {
            char result = (Math.random() > 0.5) ? 'H' : 'T';
            System.out.print(result + " ");

            if (result == target) {
                count++;
            } else {
                count = 0;
            }
        }

        System.out.println();
        System.out.println("You got " + target + " " + count + " times in a row!");
    }
}
