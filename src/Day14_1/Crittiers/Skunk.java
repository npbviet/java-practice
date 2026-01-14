package Day14_1.Crittiers;

public class Skunk extends Critter {
    private int moves;
    private boolean hungry;

    public Skunk() {
        hungry = true;
    }

    public boolean eat() {
        hungry = false;
        return true;
    }

    public Direction getMove() {
        moves++;
        if (moves <= 2) {
            return Direction.WEST;
        } else {
            moves = 0;
            if (hungry) {
                return Direction.NORTH;
            } else {
                return Direction.SOUTH;
            }
        }
    }
}