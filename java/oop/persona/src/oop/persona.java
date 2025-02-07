package oop;

public class persona {
    private String Nombre;
    public persona(String Nombre){
        this.Nombre = Nombre;
    }
    public void dormir(){
        System.out.println("zzzzz..");
    }
    public void hablar(){
        System.out.println("bla bla bla…");
    }
    public void decirNombre(){
        System.out.println(Nombre);
    }
}
