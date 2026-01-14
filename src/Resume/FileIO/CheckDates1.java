package Resume.FileIO;

import java.util.*;
import java.io.*;

public class CheckDates1 {
    public static void main (String [] args) throws FileNotFoundException{
        Scanner console = new Scanner(System.in);
        System.out.print("Nhập đường dẫn file: ");

        String linkF = console.nextLine();
        checkDates(linkF);
    }
    public static void checkDates (String linkF) throws FileNotFoundException{
        Scanner reader = new Scanner(new File(linkF));
        while (reader.hasNextLine()){
            if (!reader.hasNextInt()) {
                break;
            }

            boolean is1Month = false;
            int m1 = reader.nextInt();
            int d1 = reader.nextInt();
            int m2 = reader.nextInt();
            int d2 = reader.nextInt();

            int monthDiff = Math.abs(m1 - m2);

            if (monthDiff > 1) {
                is1Month = true;
            } else if (monthDiff == 1) {
                if (m1 < m2) {
                    if (d2 >= d1) is1Month = true;
                } else {
                    if (d1 >= d2) is1Month = true;
                }
            }

            if (is1Month){
                System.out.printf("%d/%d and %d/%d differ by one full month or more!%n", m1, d1, m2, d2);
            } else {
                System.out.printf("%d/%d and %d/%d are within one month of each other.%n", m1, d1, m2, d2);
            }
        }
        reader.close();
    }
}