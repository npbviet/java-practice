package Resume.Critters;

import java.awt.*;

public class WhiteRabbit extends Critter {
    private int moves;
    private int eatCount;

    public WhiteRabbit() {
        moves = 0;
        eatCount = 0;
    }

    public Color getColor () {
        return Color.WHITE;
    }

    public boolean eat() {
        eatCount++;
        return eatCount % 2 != 0;
    }

    public Attack fight(String opponent) {
        if (opponent.equals("^") ||opponent.equals(">") ||opponent.equals("<") ||opponent.equals("V")) {
            return Attack.SCRATCH;
        } else {
            return Attack.ROAR;
        }
    }

    public Direction getMove() {
        moves++;
        if (moves <= 5) {
            return Direction.NORTH;
        } else if (moves <= 10) {
            return Direction.SOUTH;
        } else if (moves <= 15) {
            return Direction.EAST;
        } else {
            moves = 1;
            return Direction.NORTH;
        }
    }

    public String toString() {
        return "V";
    }
}