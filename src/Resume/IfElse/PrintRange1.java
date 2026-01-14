package Resume.IfElse;

import java.util.*;

public class PrintRange1 {
    public static void main (String []args){
        Scanner console = new Scanner (System.in);
        System.out.print("Enter your first number: ");
        int a = console.nextInt();
        System.out.print("Enter your second number: ");
        int b = console.nextInt();

        printRange(a,b);
    }
    public static void printRange(int a, int b){
        System.out.print(a + " ");
        if (a == b) {
            return;
        } else if (a > b){
            for (int i = 1; i < (a-b); i++){
                System.out.print(a - i + " ");
            }
        } else {
            for (int i = 1; i < (b - a); i++){
                System.out.print(a + i + " ");
            }
        }
        System.out.print(b);
    }
}