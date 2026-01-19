package Day19_1.Loops;

public class Book2 {
    public static final int SIZE = 10;
    public static void main (String [] args){
        for (int a = SIZE; a >= 0; a--){
            System.out.print(" ");
        }
        drawLine(SIZE);
        System.out.println();
        int z = 1;
        for (int b = SIZE; b > 0; b--){

            drawRoof(b, z);
            System.out.println();
            z++;
        }
        drawLine(SIZE);
        drawSide(SIZE);
        System.out.println();
        for (int c = 0; c < SIZE/2; c++){
            drawFront(SIZE);
            drawSide(SIZE - c*2);
            System.out.println();
        }
        drawLine(SIZE);
        System.out.println();
        System.out.println("Now only $" + SIZE/2 + "0!");
    }

    public static void drawRoof (int s, int z) {
        for (int i = 0; i < s; i++){
            System.out.print(" ");
        }
        System.out.print("/");
        int blank = s*3 - 3;
        for (int c = blank; c > 0; c--){
            System.out.print(" ");
        }
        System.out.print("_");
        for (int d = 1; d <= z; d++){
            System.out.print("__/");
        }
        drawSide(z-1);

    }
    public static void drawMiniRoof(int d) {
        for (int i = 1; i <= d; i++){
            System.out.print("_");
            System.out.print("_");
            System.out.print("/");
        }

    }
    public static void drawSide (int d){
        for (int i = 1; i <= d; i++ ){
            System.out.print("/");
        }
    }
    public static void drawFront (int s){
        System.out.print("|");
        printBlankFont(s);
        System.out.print("How to Code in Java ");
        printBlankFont(s);
        System.out.print("|");
    }
    public static void printBlankFont (int s){
        for (int i = 0; i < ((s*3 - 19)/2); i++){
            System.out.print(" ");
        }
    }


    public static void drawLine (int s) {
        System.out.print("+");
        for(int i = 0; i < s*3; i++){
            System.out.print("-");
        }
        System.out.print("+");
    }
}





