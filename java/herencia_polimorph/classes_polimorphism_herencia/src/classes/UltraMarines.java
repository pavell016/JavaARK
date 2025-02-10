package classes;

public class UltraMarines extends knight{
    private int years_served;
    private String Stationed_fort;
    private boolean sarcophagus;
    public UltraMarines(boolean armour, String Weapon, String rank, int years_served, String Stationed_fort, boolean sarcophagus) {
        super(armour, Weapon, rank);
        this.years_served = years_served;
        this.Stationed_fort = Stationed_fort;
        this.sarcophagus = sarcophagus;
    }
    @Override
    public String display(){
        return "armour: "+armour+
                "/// weapon: "+ weapon +
                "/// rank: "+ rank+
                "/// years served: "+ years_served+
                "/// Stationed: "+ Stationed_fort+
                "/// Sarcophagus: "+ sarcophagus;
    }
}
