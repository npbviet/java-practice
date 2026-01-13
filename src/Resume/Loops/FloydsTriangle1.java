package Resume.Loops;

import java.util.Scanner;

public class FloydsTriangle1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Max line? ");

        floydsTriangle(console.nextInt());

    }

    public static void floydsTriangle(int k) {
        int [][] triangle = new int [k][];
        fillIn(triangle);
        print(triangle);
    }

    public static void  fillIn (int [][] triangle){
        int n=1;
        for (int i = 0; i < triangle.length; i++) {
            triangle[i]= new int [i+1];
            for (int j = 0; j<=i; j++) {
                triangle[i][j]= n;
                n += 1;
            }
        }
    }

    public static void  print (int [][] triangle){
        for (int i = 0; i < triangle.length; i++) {
            for (int j = 0; j<=i; j++) {
                System.out.print(triangle[i][j] + " ");
            }
            System.out.println();
        }
    }
}
