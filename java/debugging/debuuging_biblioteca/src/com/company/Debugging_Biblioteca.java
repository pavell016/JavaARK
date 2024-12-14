package com.company;
/*
Consultar tota la biblioteca i que imprimeixi tots els títols per consola.
Consultar si existeix un títol en concret especificat per l'usuari.
Inserir nous llibres.
Eliminar un llibre (si existeix). Aquest mètode usarà el mètode creat a l'apatat 2.
Modificar el títol d'un llibre actual (si existeix). Aquest mètode usarà el mètode creat a l'apatat 2.
Eliminar tots els llibres (reiniciar l'ArrayList)
Sortir.
 */
import java.util.ArrayList;
import java.util.Scanner;
public class Debugging_Biblioteca {
    final static String MENU_PRINCIPAL = "\n\t1. Consultar Biblioteca\n\t2. Consultar títol\n\t3. Inserir llibre\n\t4. Eliminar llibre\n\t5. Modificar llibre\n\t6. Reiniciar " +
            "Biblioteca\n\t7. Sortir";
    public static void main (String[] args){
        ArrayList<String> llibres;
        llibres = bibliotecaInit();

        int opcioMenuPrincipal = 0;

        do {
            System.out.println("Benvingut/da al programa");
            opcioMenuPrincipal = llegirEnter(MENU_PRINCIPAL, 0, 7);

            switch (opcioMenuPrincipal) {
                case 1:
                    imprimirBiblioteca(llibres);
                    break;
                case 2:
                    consultarLlibre(llibres);
                    break;
                case 3:
                    afegirLlibre(llibres);
                    break;
                case 4:
                    eliminarLlibre(llibres);
                    break;
                case 5:
                    modificarLlibre(llibres);
                    break;
                case 6:
                    llibres = reiniciarBiblioteca(llibres);
                    break;
                case 7:
                    llibres = reiniciarBiblioteca(llibres);
                    System.out.println("Adéu");
                    break;
            }
        }while(opcioMenuPrincipal != 7);
    }

    /**
     * Mètode per inserir alguns llibres dins de la Biblio
     * @return Biblioteca inicialitzada
     */
    private static ArrayList<String> bibliotecaInit() {
        ArrayList<String> biblioteca = new ArrayList<>();
        biblioteca.add("Tirant Lo Blanc");
        biblioteca.add("Solitud");
        biblioteca.add("El Quixot");
        biblioteca.add("Sapiens");
        biblioteca.add("Teo va a l'escola");
        biblioteca.add("Jumanji");
        biblioteca.add("Spiderman: No way home");
        biblioteca.add("Harry Potter i el calze de foc");

        return biblioteca;
    }

    /**
     * Reiniciar biblioteca
     * @param llibres
     * @return
     */
    private static ArrayList<String> reiniciarBiblioteca(ArrayList<String> llibres) {
        llibres.clear();
        return llibres;
    }

    /**
     * Mètode per a imprimir tots els títols dels llibres per pantalla
     * @param llibres
     */
    private static void imprimirBiblioteca(ArrayList<String> llibres) {
        for (String llibre : llibres) {
            System.out.println(llibre);
        }
    }

    /**
     * Aquest mètode serveix per llegir un enter de teclat amb control d'errors.
     * @param menuPrincipal: Serveix per passar-li el text a mostrar del menú.
     * @param min: Valor mínim acceptat
     * @param max: Valor màxim acceptat
     * @return : retorna un enter dins del domini de valors
     */
    public static int llegirEnter(String menuPrincipal, int min, int max) {
        Scanner llegir = new Scanner(System.in);
        int opcio = 0;
        boolean valorCorrecte = false;

        do {
            System.out.println(menuPrincipal);

            valorCorrecte = llegir.hasNextInt();

            if (!valorCorrecte){
                System.out.println("ERROR: No has introduït un enter");
                llegir.nextLine();
            }else{
                opcio = llegir.nextInt();
                llegir.nextLine();

                if (opcio < min || opcio > max){
                    System.out.println("ERROR: Opció no correcte");
                    valorCorrecte = true;
                }
            }

        }while(!valorCorrecte);

        return opcio;
    }

    /**
     * Aquest métode es per consultar si el llibre que has escrit esta al catalog
     * @param llibres
     * @return
     */
    public  static boolean consultarLlibre(ArrayList llibres){
        Scanner input = new Scanner(System.in);
        boolean verificacion;
        String inputUsuari;
        System.out.println(llibres);
        System.out.println("Escriu el llibre que vols buscar ");
        inputUsuari=input.nextLine();
        verificacion=llibres.contains(inputUsuari);
        if (verificacion){
            verificacion=true;
            System.out.println("El llibre que has escrit esta en el catàlog");
        }else{
            verificacion=false;
            System.out.println("El llibre que has escrit no esta en el catàlog");
        }
        return verificacion;
    }

    /**
     * Aquest métode es per inserir llibres a la biblioteca
     * @param llibres
     * @return
     */
    public static ArrayList<String> afegirLlibre(ArrayList<String> llibres) {
        Scanner input = new Scanner(System.in);
        String inputUsuari;
        System.out.println("Escriu quants llibres vols inserir:");
        int numLlibres = llegirEnter("", 1, llibres.size()-1);
        System.out.println("Escriu els llibres que vols inserir:");
        for (int i = 0; i < numLlibres; i++) {
            System.out.println("LLIBRE " + (i + 1) + " -> ");
            inputUsuari = input.nextLine();
            llibres.add(inputUsuari);
        }
        System.out.println("La biblioteca ha quedat -> ");
        System.out.println(llibres);

        return llibres;
    }


    /**
     * Aquest métode serveix per eliminar un llibre del catálog
     * @param llibres
     * @return
     */
    public static ArrayList<String> eliminarLlibre(ArrayList<String> llibres){
        Scanner input = new Scanner(System.in);
        System.out.println(llibres);
        System.out.println("Escolleix quin llibre vols eliminar escribintlo, en cas que vulguis sortir d'aquesta opció escriu 1");
        String inputUsuari=input.nextLine();
        if (inputUsuari.equals("1")){
            return llibres;
        }else if (llibres.contains(inputUsuari)){
            llibres.remove(inputUsuari);
            eliminarLlibre(llibres);
        }else{
            System.out.println("Ho sentim molt, però el llibre que vol eliminar de la Biblioteca no existeix");
            eliminarLlibre(llibres);
        }
        System.out.println(llibres);
        return llibres;
    }

    /**
     * Aquest métode es per modificar un llibre del catálog
     * @param llibres
     * @return
     */
    public static ArrayList<String> modificarLlibre(ArrayList<String> llibres) {
        Scanner input = new Scanner(System.in);
        String modified;
        System.out.println(llibres);
        if (llibres.isEmpty()) {
            System.out.println("El catáleg està buit");
        } else {
            System.out.println("Escull quin llibre vols modificar escrivint la posició en què està ->");
            int inputUsuari = llegirEnter("", 0, llibres.size() - 1);

            if (inputUsuari >= 0 && inputUsuari < llibres.size()) {
                System.out.println("Escriu la modificació que vulguis fer:");
                modified = input.nextLine();
                llibres.set(inputUsuari, modified);
                System.out.println(llibres);
            } else {
                System.out.println("Posició no vàlida. Torna-ho a intentar.");
                modificarLlibre(llibres);
            }
        }
        return llibres;
    }


}
