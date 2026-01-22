package Resume.Critters;

public class Abby extends Critter {
    private int slowdown;
    private boolean isWaiting;
    private int moves;

    public Abby() {
        this.slowdown = 0;
        this.isWaiting = false;
        this.moves = 0;
    }

    public boolean eat() {
        slowdown = 3;
        isWaiting = true;
        return true;
    }

    public Direction getMove() {
        Direction d;

        if (slowdown > 0 && isWaiting) {
            isWaiting = false;
            return Direction.CENTER;
        }

        if (moves < 4) {
            d = Direction.EAST;
        }
         else if (moves < 9 && moves > 4) {
            d = Direction.WEST;
        }  else {
            d = Direction.NORTH;
        }

         moves++;

        if (moves > 9) {
            moves = 0;
        }

        if (slowdown > 0) {
            slowdown--;
            isWaiting = true;
        }

        return d;
    }
    public String toString() {
        return "@";
    }
}