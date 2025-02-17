package rpg;

public class Ability implements Fight{
    private int damage;
    public int getDamage(){
        return damage;
    }

    public enum DamageType{
        PHISICAL,MAGICAL;
    }
    public enum range{
        CaC(1),MEDIO(10),LARGO(25);

        int distance;

        range(int distance) {
            this.distance = distance;
        }

        public int distance() {
            return distance;
        }
    }
}
