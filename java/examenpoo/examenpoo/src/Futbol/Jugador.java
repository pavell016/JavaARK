package Futbol;

public class Jugador extends Persona implements Entrenable{
    private String posicio;
    private int habilitat;
    public Jugador(String Nom, int Edat, String Pos, int hab) {
        super(Nom, Edat);
        this.posicio = Pos;
        this.habilitat = hab;
    }
    @Override
    public void entrenar(){
        this.habilitat++;
    }
    public void setPosicio(String NewPosicio){
        this.posicio = NewPosicio;
    }
    public void setHabilitat(int hab){
        this.habilitat = hab;
    }
    public String getPosicio(){
        return posicio;
    }
    public int getHabilitat(){
        return habilitat;
    }
}
