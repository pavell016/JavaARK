package Futbol;

import java.util.ArrayList;

public class Lliga {
    private String NomLliga;
    private ArrayList<Equip> equips;

    public Lliga(String NomLliga, ArrayList<Equip> equips){
        this.NomLliga = NomLliga;
        this.equips = equips;
        Initialize(equips);
    }

    /**
     * en aquesta funció s'actualitzaran la posició dels equips per a que estiguin en la posició mes baixa al començar
     */
    public void Initialize(ArrayList<Equip> equips){
        int posicioMesBaixa = equips.size();
        for(Equip e : equips){
            e.setPosicioLliga(posicioMesBaixa);
        }
    }
    public void Classificacio(){

    }

    public void Simulacio_partit(Equip e1, Equip e2){
        if (e1.AVGPerformance() > e2.AVGPerformance()){
            e1.setPosicioLliga(e1.getPosicioLliga()+1);
        }else{
            e2.setPosicioLliga(e2.getPosicioLliga()+1);
        }

    }

    public ArrayList<Equip> topMillors(int top){
        ArrayList<Equip> classificacio = new ArrayList<>();
        for (Equip e : equips){
            if (e.getPosicioLliga() < top){
                classificacio.add(e);
            }
        }
        return classificacio;
    }
}
