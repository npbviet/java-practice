package Day21_1.Parameters;

import java.util.Scanner;

public class FitnessGoal1 {
    public static void main (String[] args){
        fitnessGoal(3);
    }
    public static void fitnessGoal(int x){
        Scanner console = new Scanner(System.in);
        int count = 0;
        int streak = 0;
        int lastDay = 0;
        System.out.println("Train until you increase for " + x + " days.");
        while (streak < x) {
            System.out.print("Minutes? ");
            int current = console.nextInt();
            if (current > lastDay){
                streak++;
                System.out.println("Great job!");
            } else {
                streak = 0;
                System.out.println("Start over.");
            }
            count++;
            lastDay = current;
        }

        console.close();

        if (streak == x){
            System.out.println("Reached your goal in " + count + " total days!");
        }
    }
}
