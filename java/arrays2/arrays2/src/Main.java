import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<String> bombo1 = new ArrayList<String>();
        ArrayList<String> bombo2 = new ArrayList<String>();
        ArrayList<String> grups = new ArrayList<String>();

        bombo1.add("Manchester United(ING)");
        bombo1.add("Kantes(FRA)");
        bombo1.add("Midtjylland(DIN)");
        bombo1.add("Rennes(FRA)");
        bombo1.add("Union Berlin (GER)");
        bombo1.add("Monaco(FRA)");
        bombo1.add("PSV (NED)");
        bombo1.add("Roma (ITA)");


        bombo2.add("Barcelona(ESP)");
        bombo2.add("Juventus (ITA)");
        bombo2.add("Esporting Lisboa(POR)");
        bombo2.add("Shaktar Danesk (UK)");
        bombo2.add("Ajax (NED)");
        bombo2.add("Bayer Leverkusen(GER)");
        bombo2.add("Sevilla(ESP)");
        bombo2.add("Salzburgo(AUT)");

        int rnd1 = 0;
        int rnd2 = 0;

        for (int i = 0; i < 16; i++) {
            rnd1= (int) (Math.random()*8);
            rnd2= (int) (Math.random()*8);
            if (grups.contains(bombo1.get(rnd1)+"-"+bombo2.get(rnd2))){
                System.out.println("");
            }else{
                grups.add(bombo1.get(rnd1)+"-"+bombo2.get(rnd2));
            }

        }
        for (String i : grups){
            System.out.println(i);
        }

    }
}