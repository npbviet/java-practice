package Resume.Critters;

import java.awt.*;
import java.util.Random;

public class Ostrich extends Critter {
    private boolean isMove;
    private int move;
    private Direction currentDir;

    public Ostrich() {
        move = 0;
        isMove = false;
        currentDir = Direction.CENTER;
    }

    public Color getColor () {
        if (isMove){
            return Color.WHITE;
        } else {
            return Color.CYAN;
        }
    }

    public Direction getMove() {
        move++;
        if (move <= 10 ){
            return Direction.CENTER;
        } else if (move <= 20) {
            if (move == 11) {
                Random r = new Random();
                currentDir = r.nextBoolean() ? Direction.WEST : Direction.EAST;
            }
            return currentDir;
        } else {
            move = 1;
            isMove = false;
            return Direction.CENTER;
        }
    }
}