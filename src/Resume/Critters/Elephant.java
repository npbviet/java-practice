package Resume.Critters;

import java.awt.*;
import java.util.Random;

public class Elephant extends Critter {
    private Attack atk;
    private boolean hungry;
    private Random r = new Random();

    public Elephant(Attack attack) {
        this.atk = attack;
        hungry = r.nextBoolean();
    }

    public Color getColor () {
        return Color.GRAY;
    }

    public boolean eat (){
        return hungry;
    }

    public Attack fight(String opponent) {
        return atk;
    }

    public Direction getMove() {
        Direction move;

        if (getX() != getWidth() / 2) {
            move = Direction.WEST;
        } else if (getY() != getHeight() / 2) {
            move = Direction.NORTH;
        } else {
            return Direction.CENTER;
        }

        String neighbor = getNeighbor(move);
        if (neighbor.equals("J") || neighbor.equals("j")) {
            return Direction.CENTER;
        }

        return move;
    }

    public String toString() {
        if (hungry){
            return "J";
        } else {
            return "j";
        }

    }
}