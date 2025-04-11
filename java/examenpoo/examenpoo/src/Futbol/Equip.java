package Futbol;

import java.util.ArrayList;
import java.util.Arrays;

public class Equip {
    private String Nom;
    private Entrenador entrenador;
    private ArrayList<Jugador> jugadors;
    private int PosicioLliga = 0;

    public Equip(String Nom, Entrenador entrenador, ArrayList<Jugador> jugadors){
        this.Nom = Nom;
        this.entrenador = entrenador;
        this.jugadors = jugadors;
    }

    public void AddPlayer(Jugador jugadorNou){
        jugadors.add(jugadorNou);
    }
    public void RmPlayer(Jugador rmplayer){
        jugadors.remove(rmplayer);
    }
    public double AVGPerformance(){
        int totalskill=0;
        for (Jugador j : jugadors){
            totalskill+=j.getHabilitat();
        }
        return totalskill / jugadors.size();
    }
    public void setPosicioLliga(int pos){
        this.PosicioLliga=pos;
    }

    public int getPosicioLliga() {
        return PosicioLliga;
    }
    public void setNom(String nomE){
        this.Nom = nomE;
    }
    public String getNom(){
        return Nom;
    }
    public void changeTrain(Entrenador e){
        this.entrenador = e;
    }
    public Entrenador getEntrenador(){
        return entrenador;
    }
    public ArrayList<Jugador> getJugadors(){
        return jugadors;
    }
}
