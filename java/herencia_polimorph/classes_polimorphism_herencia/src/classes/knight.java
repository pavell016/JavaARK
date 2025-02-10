package classes;

public class knight {
    protected boolean armour;
    protected String weapon;
    protected String rank;
    public knight(boolean armour, String Weapon, String rank){
        this.armour = armour;
        this.weapon = Weapon;
        this.rank = rank;
    }
    public String display(){
        return "armour: "+armour+
                "/// weapon: "+ weapon +
                "/// rank: "+ rank;
    }
}
