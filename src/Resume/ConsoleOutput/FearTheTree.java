package Resume.ConsoleOutput;

public class FearTheTree {
    public static void main(String[] args) {
        drawFigure();
    }

    public static void drawFigure() {
        for (int i=1; i <= 20; i++) {
            System.out.print("\\");
        }
        System.out.println();
        System.out.println("|| FEAR THE TREE! ||");
        for (int i=1; i <= 20; i++) {
            System.out.print("/");
        }
        System.out.println();

    }
}