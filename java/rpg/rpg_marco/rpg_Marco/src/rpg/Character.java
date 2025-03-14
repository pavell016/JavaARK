package rpg;
public abstract class Character {
    private String name;
    private int level;

    public Character(String name, int level) {
        this.name = name;
        this.level = level;
    }
    public Character() {
        this(null, 0);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}