import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //area cuadrado
        Scanner input = new Scanner(System.in);
        System.out.println("entra els cm d'un costat de un cuadrat:");
        int lado = input.nextInt();
        System.out.println("Area d'un cuadrat de "+lado+"cm de costat:"+Math.pow(lado,2));

        System.out.println("entra els cm de la base d'un trianglet:");
        int base = input.nextInt();
        System.out.println("entra els cm de la alçada d'un trianglet:");
        int alt = input.nextInt();
        System.out.println("Area d'un triangle de "+base+"cm de base i altura de "+alt+":"+
                                   base*alt/2);


        System.out.println("introdueix el radi d'una circumferencia:");
        float radi = input.nextInt();
        System.out.println("Area d'una circumferencia de "+radi+"cm de radi:"+
                                   Math.PI * Math.pow(radi,2));

    }
}