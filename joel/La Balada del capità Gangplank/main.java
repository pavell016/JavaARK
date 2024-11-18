import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Llegim fins que es completi l'input
        while (sc.hasNext()) {
            int monedes = sc.nextInt();  // El nombre de monedes
            int comenca = sc.nextInt();  // Qui comença (0 - Tu, 1 - Gangplank)
            
            // Determinar qui guanya segons les regles del joc
            if (monedes % 4 == 0) {
                // Si el nombre de monedes és múltiple de 4, el jugador que comença perd
                if (comenca == 0) {
                    System.out.println("GANGPLANK");
                } else {
                    System.out.println("JO");
                }
            } else {
                // Si el nombre de monedes no és múltiple de 4, el jugador que comença guanya
                if (comenca == 0) {
                    System.out.println("JO");
                } else {
                    System.out.println("GANGPLANK");
                }
            }
        }
        
        sc.close();
    }
}