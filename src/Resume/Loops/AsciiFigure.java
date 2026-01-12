package Resume.Loops;

public class AsciiFigure {
    public static void main(String[] args) {
        // System.out.println("Hello");
        drawFigure();
    }

    public static final int SIZE = 7;

    public static void drawFigure() {
        for (int i=1; i <= SIZE; i++) {
            for (int j=1; j <= 4 * (SIZE - i); j++) {
                System.out.print("/");
            }
            for (int j=1; j <= 8 * (i - 1); j++) {
                System.out.print("*");
            }
            for (int j=1; j <= 4 * (SIZE - i); j++) {
                System.out.print("\\");
            }
            System.out.println();
            
        }
    }

}
