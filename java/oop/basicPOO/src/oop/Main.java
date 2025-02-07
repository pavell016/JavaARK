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
 */
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
}