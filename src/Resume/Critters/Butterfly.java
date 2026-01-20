package Resume.Critters;

import java.awt.*;

public class Butterfly extends Critter {
    private int moves;

    public Butterfly() {
        moves = 0;
    }

    public Color getColor () {
        return Color.YELLOW;
    }

    public Direction getMove() {
        moves++;
        if (moves % 2 == 0) {
            if (moves == 2){
                return Direction.WEST;
            } else {
                moves = 0;
                return Direction.EAST;
            }

        } else {
            return Direction.NORTH;
        }
    }
    public String toString() {
        if ( moves % 2 == 0){
            return "x";
        } else {
            return "-";
        }
    }
}