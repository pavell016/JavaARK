package rpg;

public class Ability {
    private Type type;
    private Range range;
    private int damage;

    public Ability(Type type, Range range, int damage) {
        this.type = type;
        this.range = range;
        this.damage = damage;
    }
    public Ability() {
        this(Type.NULL, Range.NULL, 0);
    }

    // Getters and setters
    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Range getRange() {
        return range;
    }

    public void setRange(Range range) {
        this.range = range;
    }

    public int getDamage() {
        return damage;
    }
}
