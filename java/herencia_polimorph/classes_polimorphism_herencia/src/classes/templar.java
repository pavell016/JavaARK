package classes;

public class templar extends knight{
    private String order;
    private boolean on_mission;
    private String church_stationed;

    public templar(boolean armour, String Weapon, String rank, String order, boolean on_mission, String church_stationed) {
        super(armour, Weapon, rank);
        this.order = order;
        this.on_mission = on_mission;
        this.church_stationed = church_stationed;
    }
    @Override
    public String display(){
        return "armour: "+armour+
                "/// weapon: "+ weapon +
                "/// rank: "+ rank+
                "/// order: "+ order+
                "/// on a mission: "+ on_mission+
                "/// stationed on: "+ church_stationed;
    }
}
