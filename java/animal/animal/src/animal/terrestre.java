package animal;

public class terrestre extends Animal{
    public terrestre(String nom, double x, double y, double z){
        super(nom, x,y,z);
    }

    @Override
    public void move(posicio posicio) {
        posicio.setX(posicio.getX()+7);
        posicio.setY(posicio.getY()+7);
        posicio.setZ(posicio.getZ()+7);
    }
}
