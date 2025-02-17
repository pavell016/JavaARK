package rpg;

public class Character {
    private String name;
    private int lvl;
    private Ability[] si;
    public Character(String name, int lvl, Ability[] si){
        this.name = name;
        this.lvl = lvl;
        this.si = si;

    }
}
