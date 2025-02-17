package animal;

public abstract class Animal implements Moviment{
    protected String nom;
    protected posicio coordenada;
    public Animal(String nombre, double x, double y, double z) {
        this.nom = nombre;
        this.coordenada = new posicio(x, y, z);
    }

    public String getNom() {
        return nom;
    }

    public posicio getCoordenada() {
        return coordenada;
    }

    public void setCoordenada(posicio coordenada) {
        this.coordenada = coordenada;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String tostring(){
        return "["+nom+" "+coordenada.getX()+" "+coordenada.getY()+" "+coordenada.getZ()+"]";
    }
}
