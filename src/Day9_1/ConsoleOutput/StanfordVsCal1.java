package Day9_1.ConsoleOutput;

import java.util.Scanner;

public class StanfordVsCal1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Stanford: How many points did they score? ");
        int sScore = console.nextInt();
        System.out.print("Cal: How many points did they score? ");
        int cScore = console.nextInt();
        stanfordVsCal(sScore, cScore);
    }

    public static void stanfordVsCal(int a, int b) {
        if (a > b) {
            System.out.println("Stanford won!");
        } else if ( a < b) {
            System.out.println("Cal won!");
        } else {
            System.out.println("Stanford and Cal draw!");
        }
    }
}