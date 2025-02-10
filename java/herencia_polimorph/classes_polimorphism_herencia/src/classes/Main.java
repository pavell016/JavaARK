package classes;

public class Main {
    public static void main(String[] args) {
        knight knight1 = new knight(false, "spear", "cadet");
        templar horacio = new templar(true, "long Sword", "knight commander", "Temple", false,
                                      "Church of the Fool, Bansy Harbour");
        UltraMarines titus = new UltraMarines(true, "Chainsword","Primaris Marine lieutenant",
                                              400, "Xeno", false);

        System.out.println(knight1.display());
        System.out.println(horacio.display());
        System.out.println(titus.display());
    }
}