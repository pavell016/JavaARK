package oop;

/*
Los objetivos de este ejercicio son:
     Uso POO
     Uso de modificadores de acceso
     Uso de la línea de comandos para interactuar con el usuario
     Uso de bucles

TAREA #1
Define la clase Coche que disponga de:
     Atributo velocidad (en km/h) de tipo double denominado
     Método acelerar() que tenga como parámetro de entrada el incremento de velocidad (en
        km/h) y se encargará de sumar al valor del atributo velocidad el incremento
     Método frenar() que tenga como parámetro de entrada la disminución de velocidad (en km/h)
        y se encargará de restar al valor del atributo velocidad la disminución.
     Método getVelocidad() que retorne el valor del atributo velocidad
Cuando se crea un Coche el valor de su velocidad es 0, por lo que no es necesario implementar
un constructor propio
¿Qué modificadores de acceso usaremos para el atributo y los métodos?
     Atributo velocidad: private, para impedir que se modifique el valor de la velocidad de
        forma incorrecta
     Métodos acelerar(), frenar(), getVelocidad(): puplic, para permitir que se utilicen desde
        otras clases.

TAREA #2
En la clase Main, crea un objeto del tipo Coche y muestra al usuario el siguiente menú
[1] Acelerar
[2] Frenar
[3] Imprimir velocidad
[4] Salir
Prueba tu código escogiendo las diferentes acciones del menú.


 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        coche car = new coche();
        boolean programa = true;
        while (programa){
            System.out.println("[1] Acelerar\n" +
                                       "[2] Frenar\n" +
                                       "[3] Imprimir velocidad\n" +
                                       "[4] Salir");
            int option = input.nextInt();
            switch (option){
                case 1:
                    car.acelerar(10.00);
                    break;
                case 2:
                    car.frenar(10.00);
                    break;
                case 3:
                    System.out.println(car.geetVelocidad());
                    break;
                case 4:
                    programa = false;
                    break;
                default:
                    break;
            }
        }
    }
}