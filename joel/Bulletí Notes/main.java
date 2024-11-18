import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota = sc.nextInt();
        
        // Determinem la qualificació segons l'interval de la nota
        if (nota >= 0 && nota <= 4) {
            System.out.println("Suspes");
        } else if (nota >= 5 && nota <= 6) {
            System.out.println("Aprovat");
        } else if (nota >= 7 && nota <= 8) {
            System.out.println("Notable");
        } else if (nota >= 9 && nota <= 10) {
            System.out.println("Excelent");
        } else {
            System.out.println("Nota fora de rang");
        }
        
        sc.close();
    }
}