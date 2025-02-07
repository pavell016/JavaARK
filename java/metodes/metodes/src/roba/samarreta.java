package roba;

public class samarreta {
    public String color;
    public char talla;
    private static boolean disponibilitat=true;
    public samarreta(String color, char talla){
        this.color = color;
        this.talla = talla;

    }
    public void set_dis(){
        samarreta.disponibilitat = true;
    }
    public void provar(){
        if(!disponibilitat){
            System.out.println("La samarreta et queda be");
        }else{
            System.out.println("La samarreta no et queda be");
        }
    }
}
