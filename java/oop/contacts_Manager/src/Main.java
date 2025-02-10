/*
Los objetivos de este ejercicio son:
     Uso POO
     Uso de modificadores de acceso
     ArrayList
Tienes que desarrollar un programa que gestione y almacene toda la información de contacto de tus
amigos.

TAREA #1
Comenzarás creando una clase responsable de guardar la información de contacto de una única
persona. Podría ser algo así:
    class Contact{
        String name;
        String phoneNumber;
        String email;
    }
Date cuenta de que el código propone usar una String para almacenar un número de teléfono
(phoneNumber), en lugar de usar un tipo int. ¿Por qué crees que ha sido así?
    a) Porque no podemos comparar tipos int
    b) Porque los números de teléfono pueden comenzar por 0 (ej: 0079 657889456y los tipos int no
    pueden almacenar los ceros a la izquierda.
    c) Porque el máximo valor de un tipo int es más pequeño que un número de teléfono típico
    d) Porque una String requiere de menos memoria que un int.
Puede haber más de una opción válida

TAREA #2
Modifica el código de la clase Contact para cumplir con los siguientes requisitos:
     Protege el acceso a los atributos de la clase Contact declarándolos como privados.
     Cuando das de alta un nuevo contacto obligatorio tienes que introducir el nombre (name) y el
    número de teléfono. El email no es obligatorio
     Una vez que has creado un contacto, tiene que ser posible modificar cualquiera de sus
    características(name, phoneNumber, email).
     Tiene que ser posible acceder a las características de un contacto en modo lectura

TAREA #3
Ahora que ya tienes la clase Contact, vamos a por la clase ContactManager. Esta clase tiene
gestionar una colección de contactos y tiene que permitir añadir un nuevo contacto, así como buscar
un contacto por su nombre.
Hint:
Ten en cuenta que cuando se intenta añadir un nuevo contacto debes evitar que haya
contactos duplicados. Supondremos que dos contactos son iguales cuando tengan el
mismo nombre.

TAREA #4
Para poder ejecutar esta aplicación necesitamos crear un objeto del tipo ContactManager en el
méto_do inicio de la clase Main
    public class Main {
        public static void main(String[] args) {
            ContactManager myContactManager = new ContactManager();
        }
    }
Crea al menos 3 contactos (con y sin email) y añádelos a la lista de contactos. Imprime por consola.
Trata de repetir algún contacto para testear que tu código evita repeticiones y hace lo esperado.

TAREA #5
Al iniciarse la aplicación muestra un menú al usuario como el que ves en la imagen. De forma que el
usuario pueda añadir nuevos contactos y buscar contactos existentes

TAREA #6
Para terminar tu aplicación y antes de sacarla a “producción” realiza un test de todas sus
funcionalidades (añadir y buscar contactos) probando con diferentes valores de entrada (contacto con
nombre, teléfono y email, contacto con nombre y teléfono, contacto con sólo nombre, contacto
repetido, contacto con nombre …) para verificar que el código que has desarrollado cumple con los
requisitos. Para ayudarte en el seguimiento de las pruebas que hagas, te ayudará si las describes en
una tabla tipo la que te presento a continuación:
Funcionalidad bajo
test
Valores de
entrada
Valores de salida
esperados
Valores de
salida obtenidos
Resultado
(ok/ko)

TAREA #7
Documenta tu código, generando los Java Documentation comments de los métodos importantes en
la clase ContactManager, en la clase Main, … Esto te permitirá agilizar revisiones posteriores de
código a ti o a cualquier desarrollador.
Hint:
IntelliJ te ayuda a generar Java Documentation comments de los métodos de tu
código. Colócate antes de la declaración del método escribe /** y pulsa enter.
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