import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Scanner input = new Scanner(System.in);
        int torres = input.nextInt();
        input.nextLine(); // Limpiar el salto de línea después de `nextInt`

        ArrayList<String> casos = new ArrayList<>();

        for (int i = 0; i < torres; i++) {
            boolean possible = true;
            int animals = input.nextInt();
            input.nextLine();
            String cables = input.nextLine().replace(" ", ""); // Limpiar el salto de línea después de `nextInt`

            if (cables.charAt(0) != cables.charAt(cables.length() - 1)) {
                possible = false;
            }
            for (int j = 0; j < cables.length()-1 ; j++) {

                if (cables.charAt(j) == cables.charAt(j + 1)) {
                    possible = false;
                    break; // No es necesario continuar si ya sabemos que es imposible
                }
            }
            if (possible){
                casos.add("POSIBLE");
            }else {
                casos.add("IMPOSIBLE");
            }
        }
        for (String i : casos){
            System.out.println(i);
        }

         */
        Scanner input = new Scanner(System.in);
        int torres = input.nextInt();
        input.nextLine(); // Limpiar el salto de línea después de `nextInt`
        ArrayList<String> casos = new ArrayList<>();

        for (int i = 0; i < torres; i++) {
            int animals = input.nextInt();
            input.nextLine(); // Limpiar el salto de línea después de `nextInt`
            String cables = input.nextLine().replace(" ", ""); // Eliminar espacios de la cadena
            boolean possible = true;

            // Verificar si la cadena está vacía
            if (cables.isEmpty()) {
                possible = false;
            } else {
                // Verificar si el primer y último carácter son iguales
                if (cables.charAt(0) == cables.charAt(cables.length() - 1)) {
                    System.out.println(possible);
                    possible = false;
                }

                // Verificar caracteres consecutivos iguales
                for (int j = 0; j < cables.length() - 1; j++) {
                    if (cables.charAt(j) == cables.charAt(j + 1)) {

                        possible = false;
                        break; // No es necesario continuar si ya sabemos que es imposible
                    }
                }
            }

            // Añadir el resultado basado en si cumple las condiciones o no
            if (possible == true) {
                casos.add("POSIBLE");
            } else {
                casos.add("IMPOSIBLE");
            }
        }

        // Imprimir todos los resultados
        for (String resultado : casos) {
            System.out.println(resultado);
        }

        input.close();
    }
}




