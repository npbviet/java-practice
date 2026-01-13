package Day13_1.Loops;

import java.util.Scanner;

public class Guess2D {
    public static final int MAX = 100;
    static int totalGame = 0;
    static int totalGuess = 0;


    public static void main(String[] args) {
        System.out.println("This program is a 2-D guessing game.");
        System.out.println("I will think of a point somewhere");
        System.out.println("between (1, 1) and (" + MAX + ", " + MAX + ")");
        System.out.println("and give hints until you guess it.");
        System.out.println();

        Scanner console = new Scanner(System.in);
        playLoop(console);
    }
    public static void playLoop(Scanner console) {
        boolean playAgain = true;
        while (playAgain) {
            startGame(console, 1, MAX);

            System.out.print("Play again? ");
            String answer = console.next().toLowerCase();
            System.out.println();

            if (answer.startsWith("y") || answer.equals("yeehaw")) {
                playAgain = true;
            } else {
                playAgain = false;
                showResults();
            }
        }
    }

    public static void startGame(Scanner console, int min, int max) {
        int winX = (int)(Math.random() * (max - min + 1) + min);
        int winY = (int)(Math.random() * (max - min + 1) + min);
        int guessX = -1;
        int guessY = -1;
        int guessCount = 0;

        while (guessX != winX || guessY != winY) {
            System.out.print("Guess x and y: ");
            guessX = console.nextInt();
            guessY = console.nextInt();
            guessCount++;

            if (guessX == winX && guessY == winY) {
                break;
            }

            double distance = Math.sqrt(Math.pow(winX - guessX, 2) + Math.pow(winY - guessY, 2));

            String status;
            if (distance <= 1.5) {
                status = "hot!";
            } else if (distance <= 5.0) {
                status = "warm.";
            } else {
                status = "cold.";
            }

            String dirX = "";
            if (guessX < winX) dirX = "east";
            else if (guessX > winX) dirX = "west";

            String dirY = "";
            if (guessY < winY) dirY = "north";
            else if (guessY > winY) dirY = "south";

            String direction = (dirY + " " + dirX).trim();
            System.out.println("You're " + status + " Go " + direction);
        }

        System.out.println("You got it right in " + guessCount + " guesses!");

        totalGame++;
        totalGuess += guessCount;
    }
    public static void showResults() {
        System.out.println("Overall results:");
        System.out.println("Games played  = " + totalGame);
        System.out.println("Total guesses = " + totalGuess);
        System.out.printf("Guesses/game  = %.1f\n", (double)totalGuess / totalGame);
    }
}