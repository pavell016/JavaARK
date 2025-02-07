package oop;

/*
Los objetivos de este ejercicio son:
     Ver como se define una clase en Java, como se declaran sus atributos y métodos
     Ver como se define el constructor de una clase y si es necesario frente al constructor por
        defecto que ofrece el lenguaje
     Ver como se aplican modificadores de acceso a una clase, a sus atributos y métodos
     Ver cómo se declara un objeto de una clase y se le manipula mediante llamadas a métodos.
Define una clase Persona que tenga:
     Un atributo denominado nombre de tipo String
     Un método denominado dormir() que no retorne nada y que imprima por consola “zzzzz..”.
     Un método denominado hablar() que no retorne nada y que imprima por consola “bla bla
    bla…”
     Un método denominado decirNombre() que no retorne nada y que imprima por consola el
        valor del atributo nombre.
--INFO--
Presta atención en el uso de modificadores de acceso cuando escribas tu código.
Recuerda que es recomendable:
     Declarar todas tus clases como public
     Declarar todos tus atributos (fields) como private
     Declarar un método como public, cuando se considera una acción
     Declarar un método como private cuando se considera un método de ayuda
        (helper method)
--END INFO--
En la clase Main.java crea un objeto persona con el nombre que te apetezca y hazle decir su nombre,
hablar y dormir
 */
public class Main {
    public static void main(String[] args) {
        persona persona1 = new persona("Pedro");
        persona1.hablar();
        persona1.decirNombre();
        persona1.dormir();
    }
}