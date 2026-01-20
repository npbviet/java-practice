package Resume.Loops;

import java.util.Scanner;

public class NumberLoops2 {
    public static void main (String []args){
        Scanner console = new Scanner(System.in);
        System.out.println("Please enter your nth number: ");

        numberLoops(console.nextInt());
    }
    public static void numberLoops(int n) {
        for (int i = 1; i <= n; i++){
            for (int k = n-i; k > 0; k--){
                System.out.print(".");
            }
            for (int j = 1; j <= i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}