package Resume.Parameters;

import java.util.Scanner;

public class Grades {
    private static double scoreHomeWork, scoreMidTerm, scoreFinal;

    public static void main (String [] args) {
        System.out.println("This program reads your scores on homework\nand exams and reports your course grade or\nwhat score you need on the final exam.\n");
        Scanner console = new Scanner(System.in);
        System.out.print("Exam weights? ");
        int rateMidTerm = console.nextInt(), rateFinal = console.nextInt();

        System.out.println();
        calHomeWork(console, 100 - rateFinal - rateMidTerm);
        System.out.println();
        calExam(console, rateMidTerm, false);

        int takenFinal = 0;
        while (takenFinal != 1 && takenFinal != 2) {
            System.out.print("\nHave you taken the final? (1=yes, 2=no) ");
            takenFinal = console.nextInt();
        }
        if (takenFinal == 1) calExam(console, rateFinal, true);
        else predictExam(console, rateFinal);
    }

    public static void calHomeWork(Scanner console, int weight) {
        System.out.println("Homework (weight "+ weight + "):");
        System.out.print("Number of assignments? " );
        int num = console.nextInt(), cur = 0, max = 0;

        for(int i = 1; i <= num; i++) {
            System.out.print("Assignment "+ i +" score and max? ");
            cur += console.nextInt();
            max += console.nextInt();
        }
        System.out.print("Sections attended? " );
        int sec = Math.min(console.nextInt() * 3, 20);

        cur = Math.min(cur + sec, max + 20);
        max += 20;
        scoreHomeWork = Math.round((double) cur / max * weight * 10.0) / 10.0;

        System.out.println("Section points = " + sec + " / 20\nTotal points = " + cur + " / " + max + "\nWeighted score = " + scoreHomeWork);
    }

    public static void calExam(Scanner console, int weight, boolean isFinal) {
        System.out.println("Exam (weight " + weight + "):");
        System.out.print("Score? ");
        int score = console.nextInt();
        System.out.print("Curve? ");
        int total = Math.min(score + console.nextInt(), 100);

        double raw = Math.round(((double) total * weight / 10.0)) / 10.0;
        System.out.println("Total points = " + total + " / 100\nWeighted score = " + raw);

        if (isFinal) {
            scoreFinal = raw;
            System.out.println("\nCourse grade = " + (scoreHomeWork + scoreMidTerm + scoreFinal));
        } else scoreMidTerm = raw;
    }

    public static void predictExam(Scanner console, int weight) {
        System.out.print("Desired percentage? ");
        double desire = console.nextDouble();
        double gradeNeed = desire - scoreHomeWork - scoreMidTerm;

        if (gradeNeed <= 0) System.out.println("Score needed = 0.0");
        else {
            double needed = Math.ceil((gradeNeed * 100.0 / weight) * 10.0) / 10.0;
            System.out.println("Score needed = " + needed);
            if (needed > 100) {
                System.out.println("Sorry, it is impossible to earn this score.\nThe highest percentage you can get is " + (scoreHomeWork + scoreMidTerm + weight) + ".");
            }
        }
    }
}




