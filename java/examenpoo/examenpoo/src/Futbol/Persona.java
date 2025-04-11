package Futbol;

public abstract class Persona {
    private String Nom;
    private int Edat;

    public Persona(String Nom, int Edat){
        this.Nom = Nom;
        this.Edat = Edat;
    }
    public void setNom(String Nom){
        this.Nom = Nom;
    }
    public void setEdat(int Edat){
        this.Edat = Edat;
    }
    public String getNom(){
        return Nom;
    }
    public int getEdat(){
        return Edat;
    }
}
