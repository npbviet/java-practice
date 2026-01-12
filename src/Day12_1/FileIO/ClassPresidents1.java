package Day12_1.FileIO;

import java.util.*;
import java.io.*;

public class ClassPresidents1 {
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("src/Day12_1/FileIO/candidates.txt");
        if (f.exists()) {
            Scanner input = new Scanner(f);
            classPresidents(input);
        } else {
            System.out.println("Không tìm thấy file tại");
        }
    }
    public static void classPresidents(Scanner input){
        String presidentJ = "";
        int presidentVoteJ = 0;
        String presidentS = "";
        int presidentVoteS = 0;

        while(input.hasNext()){
            String nameP = input.next();
            String typeClass = input.next();
            int voteP = input.nextInt();
            if (typeClass.equals("j")){
                if (voteP > presidentVoteJ) {
                    presidentVoteJ = voteP;
                    presidentJ = nameP;
                }
            }
            if (typeClass.equals("s")){
                if (voteP > presidentVoteS) {
                    presidentVoteS = voteP;
                    presidentS = nameP;
                }
            }
        }
        System.out.println("Sophomore Class President: " + presidentS + " (" + presidentVoteS + " votes)");
        System.out.println("Junior Class President: " + presidentJ + " (" + presidentVoteJ + " votes)");

    }
}