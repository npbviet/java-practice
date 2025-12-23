package Day23_12.Loops;

public class bottlesOfRootBeer {
    public static void main(String[] args) {
        sing();
    }

    public static final int SIZE = 10;

    public static void sing() {
        for (int i=SIZE; i > 0; i--) {
            System.out.println( i + " bottles of root beer on the wall");
            System.out.println( i + " bottles of root beer");
            System.out.println("Take one down, pass it around");
            System.out.println( (i-1) + " bottles of root beer on the wall");
            System.out.println();
        }
    }

}
