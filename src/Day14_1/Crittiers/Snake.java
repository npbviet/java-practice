package Day14_1.Crittiers;

import java.awt.*;
import java.util.*;

public class Snake extends Critter {
    private int step;
    private int movesInStep;
    private boolean movingSouth;
    private Random r = new Random();

    public Snake() {
        step = 1;
        movesInStep = 0;
        movingSouth = false;
    }

    public Color getColor () {
        return new Color (20, 50, 128);
    }

    public Attack fight(String opponent) {
        if (r.nextBoolean()) {
            return Attack.POUNCE;
        } else {
            return Attack.ROAR;
        }
    }

    public Direction getMove() {
        if (movingSouth) {
            movingSouth = false;
            movesInStep = 0;
            step++;
            return Direction.SOUTH;
        } else {
            movesInStep++;
            Direction d;

            if (step % 2 != 0) {
                d = Direction.EAST;
            } else {
                d = Direction.WEST;
            }

            if (movesInStep == step) {
                movingSouth = true;
            }

            return d;
        }
    }

    public String toString() {
        return "S";
    }
}