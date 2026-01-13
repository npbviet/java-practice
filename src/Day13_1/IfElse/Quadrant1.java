package Day13_1.IfElse;

import java.util.Scanner;

public class Quadrant1 {
    public static void main (String []args){
        Scanner console = new Scanner (System.in);
        System.out.print("Enter direction X: ");
        double x = console.nextInt();
        System.out.print("Enter direction Y: ");
        double y = console.nextInt();

        System.out.print("Quadrant: " + quadrant(x,y));
    }
    public static int quadrant (double x, double y){
        if (x == 0 || y == 0){
            return 0;
        } else {
            if (x > 0) {
                if (y > 0) {
                    return 1;
                } else {
                    return 4;
                }
            } else {
                if (y > 0) {
                    return 2;
                } else {
                    return 3;
                }
            }
        }
    }
}