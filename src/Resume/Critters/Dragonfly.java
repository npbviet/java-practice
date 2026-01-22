package Resume.Critters;

public class Dragonfly extends Critter {
    private int moves = 0;
    private int eatCount = 0;

    public Dragonfly() {
        this.moves = 0;
        this.eatCount = 0;
    }

    public boolean eat() {
        eatCount++;
        return true;
    }

    public Direction getMove() {

        Direction d;
        int n = eatCount + 1;
        int totalMoves = (2 + n*2);

        if (moves == 0) {
            d = Direction.NORTH;
        } else if (moves <= n){
            d = Direction.EAST;
        } else if (moves == n + 1){
            d = Direction.SOUTH;
        } else {
            d = Direction.EAST;
        }

        moves++;

        if (moves == totalMoves) {
            moves = 0;
        }


        return d;
    }
}