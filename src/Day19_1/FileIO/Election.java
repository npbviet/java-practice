package Day19_1.FileIO;

import java.util.*;
import java.io.*;

public class Election {
    public static void main (String [] args)  throws FileNotFoundException {
        calElection("src/Day19_1/FileIO/pool.txt");
    }
    public static void calElection(String filename) throws FileNotFoundException {
        Scanner console = new Scanner (new File (filename));
        int vote1 = 0;
        int vote2 = 0;

        while (console.hasNext()) {
            String state = console.next();
            int candidate1 = console.nextInt();
            int candidate2 = console.nextInt();
            int electoralVote = console.nextInt();
            String pollster = console.nextLine();

            if (candidate1 > candidate2) {
                vote1 += electoralVote;
            } else if (candidate1 < candidate2) {
                vote2 += electoralVote;
            }
        }
        System.out.println("Candidate 1: " + vote1 + " votes");
        System.out.println("Candidate 2: " + vote2 + " votes");
    }
}