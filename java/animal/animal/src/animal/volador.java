package animal;

public class volador extends Animal{
    public volador(String nom, double x, double y, double z){
        super(nom, x,y,z);
    }

    @Override
    public void move(posicio posicio) {
        posicio.setX(posicio.getX()+3);
        posicio.setY(posicio.getY()+3);
        posicio.setZ(posicio.getZ()+3);
    }
}
