package rpg;

public class Player extends Character implements Fighter {
    public Player(String name, int level) {
        super(name, level);
    }
    public Player() {
        this(null, 0);
    }

    @Override
    public void fight(Ability ability) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}