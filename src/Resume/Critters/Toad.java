package Resume.Critters;

import java.awt.*;

public class Toad extends Critter {
    private int moves;

    public Toad(int age) {
        moves = 0;
    }

    public Color getColor () {
        return new Color (192, 128, 0);
    }

    public Direction getMove() {
        moves++;

        if (moves % 5 == 0) {
            moves = 0;
            return Direction.WEST;
        } else {
            return Direction.CENTER;
        }
    }

    public String toString() {
        return "T";
    }
}