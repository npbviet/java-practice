package Resume.IfElse;

import java.util.Scanner;

public class SeeMovie1 {
    public static void main (String []args){
        Scanner console = new Scanner (System.in);
        System.out.print("Enter the cost of a ticket in dollars: ");
        double a = console.nextInt();
        System.out.print("Enter the number of stars the movie received out of 5: ");
        double b = console.nextInt();
        seeMovie(a, b);

    }
    public static void seeMovie(double a, double b){
        if (a < 5) {
            System.out.println("very interested");
        } else if (a >= 12){
            if (b == 5){
                System.out.println("sort-of interested");
            } else {
                System.out.println("not interested");
            }
        } else {
            if (b == 5){
                System.out.println("very interested");
            } else if (b >= 2) {
                System.out.println("sort-of interested");
            } else {
                System.out.println("not interested");
            }
        }
    }
}