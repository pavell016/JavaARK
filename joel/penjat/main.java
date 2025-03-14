
import java.util.ArrayList;
import java.util.Scanner;

public class main {
    
    public static void main(String[] args) {
        ArrayList<String> dibuixos = new ArrayList<>();
        dibuixos.add("+---+\n|    \n|    \n|    \n=== ");
        dibuixos.add("+---+\n|   O\n|    \n|    \n=== ");
        dibuixos.add("+---+\n|   O\n|   |\n|    \n=== ");
        dibuixos.add("+---+\n|   O\n|  /|\n|    \n=== ");
        dibuixos.add("+---+\n|   O\n|  /|\\\n|    \n=== ");
        dibuixos.add("+---+\n|   O\n|  /|\\\n|  / \n=== ");
        dibuixos.add("+---+\n|   O\n|  /|\\\n|  / \\\n=== "); 
        
        try (Scanner input = new Scanner(System.in)) {
            int casos = input.nextInt();
            for (int i = 0; i < casos; i++) {
                String paraula = input.next();
                if (paraula.contains(" ") || paraula.length() == 0) {
                    System.out.println("La paraula no pot contenir espais ni estar buida.");
                    continue;
                }
                StringBuilder paraulaaux = new StringBuilder("_".repeat(paraula.length()));
                int errors = 0;
                ArrayList<Character> lletresUsades = new ArrayList<>();
                while (errors < 6) {
                    if (String.valueOf(paraulaaux).equals(paraula)) {
                        System.out.println("Felicitats! Has endevinat la paraula");
                        break;
                    }
                    System.out.println(paraulaaux);
                    System.out.println(dibuixos.get(errors));
                    String lletra = input.next();
                    if (lletra.length() != 1) {
                        System.out.println("Només pots introduir una lletra.");
                        continue;
                    }
                    char lletraChar = lletra.charAt(0);
                    if (lletresUsades.contains(lletraChar)) {
                        System.out.println("Ja has introduït aquesta lletra.");
                        continue;
                    }
                    lletresUsades.add(lletraChar);
                    if (paraula.contains(String.valueOf(lletraChar))) {
                        for (int k = 0; k < paraula.length(); k++) {
                            if (paraula.charAt(k) == lletraChar) {
                                paraulaaux.setCharAt(k, lletraChar);
                            }
                        }
                    } else {
                        errors++;
                    }
                }
                if (errors == 6) {
                    System.out.println(dibuixos.get(errors));
                    System.out.println("Vaja! No has endevinat la paraula");
                }
            }
        }
    }
}