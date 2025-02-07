package oop;

/*
Los objetivos de este ejercicio son:
     Ver como se define una clase en Java, como se declaran sus atributos y métodos
     Ver como se define el constructor de una clase y si es necesario frente al constructor por
    defecto que ofrece el lenguaje
     Ver como se aplican modificadores de acceso a una clase, a sus atributos y métodos
     Ver cómo se declara un objeto de una clase y se le manipula mediante llamadas a métodos

TAREA #1----------------------------
Define una clase T-Shirt que cumpla con el siguiente modelo:
                                Class Shirt
                                Attributes
                    int shirtID
                    String description
                    char size
                    double price
                    int quantityInStock
                                Operations
                    public void displayInformation()
                    public void setPrice(double price)
                    public void addStock(int newStock)
En el método displayInformation() muestra el valor de los atributos de la clase por consola.
En el método setPrice() actualiza el valor del atributo price con el valor del argumento del método.
En el método addStock(), incrementa el valor del atributo quantityInStock con el valor del argumento
del método.

TAREA #2
En la clase Main.java crea un objeto T-Shirt con las siguientes características:
shirtID: 223388
description: Camiseta manga corta mujer Perkins
size: M
price: 19.90€
quantityInStock: 100
Llama al método displayInformation para ver sus características por consola, luego incrementa el
stock en 5 unidades y actualiza su precio en 15€. Vuelve a llamar al método displayInformation para
ver sus nuevas características.
 */
public class Main {
    public static void main(String[] args) {
        tshirt samarreta = new tshirt(223388,"Camiseta manga corta mujer Perkins", 'M',19.90,100);
        samarreta.displayInformation();
        samarreta.setPrice(15.00);
        samarreta.addStock(5);
        samarreta.displayInformation();
    }
}