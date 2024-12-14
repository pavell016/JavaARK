import java.util.Scanner;
public class Main {
    public static void suma(int primer, int segon){
        System.out.println(primer + segon);
        menu();
    }
    public static void resta(int primer, int segon){
        System.out.println(primer - segon);
        menu();
    }
    public static void mult(int primer, int segon){
        System.out.println(primer * segon);
        menu();
    }
    public static void div(int primer, int segon){
        System.out.println(primer / segon);
        menu();
    }
    public static void exp(int primer, int segon){
        System.out.println(Math.pow(primer,segon));
        menu();
    }

    public static void menu(){
        Scanner input = new Scanner (System.in);
        System.out.println("quima operació t'agradaria fer?\n" +
                                   "1- sumar\n" +
                                   "2- restar\n" +
                                   "3- multiplicar\n" +
                                   "4- dividir\n" +
                                   "5- exponencial");
        int option = input.nextInt();
        System.out.println("Introdueix el primer numero:");
        int primer = input.nextInt();
        System.out.println("Introdueix el segon numero:");
        int segon = input.nextInt();
        switch (option){
            case 1 :
                suma(primer,segon);
                break;
            case 2 :
                resta(primer,segon);
                break;
            case 3 :
                mult(primer,segon);
                break;
            case 4 :
                div(primer,segon);
                break;
            case 5 :
                exp(primer,segon);
                break;

        }
    }

    public static void main(String[] args) {
        menu();

    }
}