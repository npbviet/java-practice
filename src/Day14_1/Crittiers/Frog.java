package Day14_1.Crittiers;

import java.awt.*;

public class Frog extends Critter {
    private int moves;
    private int age;

    public Frog(int age) {
        this.age = age;
    }

    public Color getColor () {
        return Color.GREEN;
    }

    public Direction getMove() {
        moves++;

        if (moves % age == 0) {
            moves = 0;
            return Direction.EAST;
        } else {
            return Direction.CENTER;
        }
    }

    public String toString() {
        return "F";
    }
}