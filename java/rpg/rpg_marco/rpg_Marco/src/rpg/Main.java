package rpg;


public class Main {
    public static void main(String[] args) {
        Ability paloDestructorDeMundos5000 = new Ability(Type.MAGICAL,Range.MEDIUM,999999);
        Ability paloDestructorDeMundos5001 = new Ability(Type.MAGICAL,Range.MEDIUM,999998);
        Player manolo = new Player("manolo",30);
        NPC pedro = new NPC("Guardian de la puerta sagrada",3);
        manolo.fight(paloDestructorDeMundos5000);
    }
}