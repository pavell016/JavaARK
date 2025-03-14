package rpg;

public class NPC extends Character {
    public NPC(String name, int level) {
        super(name, level);
    }
    public NPC() {
        this(null, 0);
    }
}