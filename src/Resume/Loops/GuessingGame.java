package Resume.Loops;

import java.util.Scanner;

public class GuessingGame {
    static int totalGame = 0;
    static int totalGuess = 0;
    static int bestGuess = 9999;

    public static void main(String[] args) {
        System.out.println("This program allows you to guess random numbers.");
        System.out.println("I will think of a number between 1 and 100");
        System.out.println("and you will try to guess it.");
        System.out.println("After each guess, I will give you a clue about");
        System.out.println("whether the correct number is higher or lower.");

        Scanner console = new Scanner(System.in);
        playLoop(console);
    }
    public static void playLoop(Scanner console) {
        boolean playAgain = true;
        while (playAgain) {
            startGame(console, 1, 100);

            System.out.print("Do you want to play again? ");
            String answer = console.next().toLowerCase();

            if (answer.startsWith("y") || answer.equals("yeehaw")) {
                playAgain = true;
            } else {
                playAgain = false;
                showResults();
            }
        }
    }

    public static void startGame(Scanner console, int min, int max) {
        System.out.println("\nI'm thinking of a number between 1 and 100...");
        int winNum = (int)(Math.random() * (max - min + 1) + min);
        int n = 0;
        int guess = 0;
        while (n != winNum) {

            System.out.print("Your guess? ");
            n = console.nextInt();
            guess++;
            if (n < winNum){
                System.out.println("It's higher.");
            } else if (n > winNum){
                System.out.println("It's lower.");
            }
        }

        if(guess == 1){
            System.out.println("You got it right in " + guess + " guess!");
        } else {
            System.out.println("You got it right in " + guess + " guesses!");
        }

        totalGame++;
        totalGuess += guess;
        if (guess < bestGuess) {
            bestGuess = guess;
        }
    }
    public static void showResults() {
        System.out.println("\nOverall results:");
        System.out.println("Total games   = " + totalGame);
        System.out.println("Total guesses = " + totalGuess);
        System.out.printf("Guesses/game  = %.1f\n", (double)totalGuess / totalGame);
        System.out.println("Best game     = " + bestGuess);
    }
}