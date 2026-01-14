package Day14_1.Loops;

import java.util.*;

public class RangeOfNumbers {
    public static void main (String []args){
        Scanner console = new Scanner (System.in);
        System.out.print("Start? ");
        int a = console.nextInt();
        System.out.print("End? ");
        int b = console.nextInt();

        printRange(a,b);
    }
    public static void printRange(int a, int b){
        System.out.print(a);
        if (a == b) {
            return;
        } else if (a > b){
            for (int i = 1; i < (a-b); i++){
                System.out.print( ", " + (a - i));
            }
        } else {
            for (int i = 1; i < (b - a); i++){
                System.out.print(", " + (a + i));
            }
        }
        System.out.print(", "+ b);
    }
}