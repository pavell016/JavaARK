import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        double numero = sc.nextDouble();
        
        // Elevar el número al cuadrado
        numero = Math.pow(numero, 2);
        
        // Dar formato al resultado: 15 caracteres de ancho, ceros a la izquierda, 3 decimales
        String formateado = String.format("%015.3f", numero);
        
        // Imprimir el resultado formateado
        System.out.println(formateado);
        
        sc.close();
    }
}