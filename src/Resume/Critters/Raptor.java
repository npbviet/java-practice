package Resume.Critters;

public class Raptor extends Critter {
    private boolean initialWalk;
    private int stampMove;

    public Raptor(boolean initialWalk) {
        this.initialWalk = initialWalk;
        this.stampMove = 0;
    }

    public boolean eat() {
        stampMove = 20;
        return true;
    }

    public Direction getMove() {

        Direction d;

        if (stampMove > 0) {
            if (stampMove % 2 == 0) {
                d = Direction.NORTH;
            } else {
                d = Direction.SOUTH;
            }
            stampMove--;

            if (stampMove == 0){
                initialWalk = !initialWalk;
            }

            return d;
        } else {
            if (initialWalk) {
                return d = Direction.EAST;
            } else {
                return d = Direction.WEST;
            }
        }
    }
}