import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] notes = sc.nextLine().split(",");
        
        // Convertim les notes a double
        double primerParcial = Double.parseDouble(notes[0].trim());
        double segonParcial = Double.parseDouble(notes[1].trim());
        double practiques = Double.parseDouble(notes[2].trim());
        
        // Comprovem si alguna de les dues primeres notes és inferior a 4
        if (primerParcial < 4 || segonParcial < 4) {
            System.out.println("Suspes");
        } else {
            // Calculem la nota final tenint en compte els percentatges
            double notaFinal = (primerParcial * 0.3) + (segonParcial * 0.5) + (practiques * 0.2);
            
            // Avaluem la nota final per determinar la qualificació
            if (notaFinal > 9) {
                System.out.println("Excel·lent");
            } else if (notaFinal > 7) {
                System.out.println("Notable");
            } else if (notaFinal >= 5) {
                System.out.println("Aprovat");
            } else {
                System.out.println("Suspes");
            }
        }
        
        sc.close();
    }
}