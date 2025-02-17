package rpg;

public class Player extends Character implements Fight{

    public Player(String name, int lvl, Ability[] si){
        super(name, lvl, si);
    }
}
