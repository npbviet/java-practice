package Day20_1.Critters;

public class Tigger extends Critter {
    private int initialBounce;
    private int bounce;
    private int moves;

    public Tigger(int initialBounce) {
        this.initialBounce = initialBounce;
        this.bounce = initialBounce;
        this.moves = 0;
    }

    public boolean eat() {
        this.bounce = initialBounce;
        moves = 0;
        return true;
    }

    public Direction getMove() {

        Direction d = Direction.NORTH;

        if (moves < bounce) {
            d = Direction.NORTH;
        } else if (moves < bounce*2) {
            d = Direction.SOUTH;
        }
        moves++;

        if (moves == bounce*2){
            bounce++;
            moves = 0;
        }

        return d;
    }
}