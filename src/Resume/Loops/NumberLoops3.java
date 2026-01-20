package Resume.Loops;

import java.util.Scanner;

public class NumberLoops3 {
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
            System.out.print(i);
            for (int j = 0; j < i - 1; j++){
                System.out.print(".");
            }
            System.out.println();
        }
    }
}