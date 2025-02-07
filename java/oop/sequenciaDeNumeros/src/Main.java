import java.util.ArrayList;
import java.util.Scanner;

/*
Los objetivos de este ejercicio son:
     Uso de la línea de comandos para interactuar con el usuario
     Uso de bucles
     Uso de ArrayList
Desarrolla un programa en Java que haga uso de la línea de comandos para solicitar al usuario
números enteros positivos, guárdalos en un arraylist. Cuando el usuario introduzca un número
negativo significará que ha terminado de introducir datos, entonces muestra la secuencia en el
mismo orden en el que se ha introducido, indicando su posición y su valor.
Por ejemplo si el usuario ha introducido los números: 50, 100, 30, 20, -1
La salida del programa sería:
#0: 50
#1: 100
#2: 30
#3: 20
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> petra = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        boolean prog = true;
        while (prog){
            int num = input.nextInt();
            if (num >0){
                petra.add(num);
            }else{
                prog = false;
            }
        }
        for(int i : petra){
            System.out.println(i);
        }
    }
}