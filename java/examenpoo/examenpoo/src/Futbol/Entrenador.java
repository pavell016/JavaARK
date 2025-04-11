package Futbol;

import java.util.List;

public class Entrenador extends Persona implements Entrenable{
    private int lvlTactic;
    public Entrenador(String Nom, int Edat, int lvl){
        super(Nom,Edat);
        this.lvlTactic = lvl;
    }
    @Override
    public void entrenar(){
        this.lvlTactic++;
    }
    public void planificarEntreno(List<Persona> jugador){
        for(Persona p : jugador){
            if (p instanceof Jugador){
                ((Jugador) p).entrenar();
            }
        }
    }
}
