import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Llegim el nombre de casos
        int casos = sc.nextInt();
        
        // Processar cada cas
        for (int i = 0; i < casos; i++) {
            int vidaEscut = sc.nextInt();
            int danyTorpede = sc.nextInt();
            
            // Comprovem si un torpede és suficient
            if (vidaEscut <= danyTorpede) {
                System.out.println("SI");
            } else {
                // Calculem quants torpedes són necessaris
                int torpedesNecessaris = (int) Math.ceil((double) vidaEscut / danyTorpede);
                System.out.println("NO-" + torpedesNecessaris);
            }
        }
        
        sc.close();
    }
}