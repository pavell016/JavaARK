import java.util.Scanner;

public class Calculadora {
    /**
     * Constructor
     */
    public Calculadora(){
        System.out.println("Nova calculadora creada amb el constructor");
    }

    /**
     * Mètode static per iniciar l'execució de la Calculadora
     * @param args
     */
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        calc.init();
    }

    /**
     * Mètode per iniciar l'aplicació
     */
    private void init() {
        int result;

        System.out.println("Entri dos nombres enters:");
        int num1 = getIntFromUser();
        int num2 = getIntFromUser();

        String opcio = getMenuOption();

        switch(opcio){
            case "1":
                result = suma(num1,num2);
                break;
            case "2":
                result = resta(num1,num2);
                break;
            case "3":
                result = multiplicacio(num1,num2);
                break;
            case "4":
                result = divisio(num1,num2);
                break;
            default:
                System.out.println("ERROR: Opció invàlida");
                return;
        }
        System.out.println("El resultat de la operació es: " + result);
    }

    /**
     * Mètode per a fer la resta
     * @param num1
     * @param num2
     * @return
     */
    public int resta(int num1, int num2) {
        return num1 - num2;
    }

    /**
     * Mètode per a fer la suma
     * @param num1
     * @param num2
     * @return
     */
    public int suma(int num1, int num2) {
        int result = num1 + num2;
        if( num1 > 0 && result < num2 || num1 < 0 && result > num2) throw new ArithmeticException();
        return result;
    }

    /**
     * Mètode per a fer la multiplicació
     * @param operant1
     * @param operant2
     * @return
     */
    public int multiplicacio(int operant1, int operant2){
        return operant1 * operant2;
    }

    /**
     * Mètode per a fer la divisió
     * @param divident
     * @param divisor
     * @return
     */
    public int divisio(int divident, int divisor){
        if(divisor == 0) {
            System.err.println("ERROR: No es pot dividir entre zero.");
            throw new ArithmeticException("ERROR: No es pot dividir entre zero.");
        }
        else {
            return divident / divisor;
        }
    }

    /**
     * Mètode privat per a llegir enter
     * @return
     */
    private int getIntFromUser() {
        Scanner scanner = new Scanner(System.in);
        boolean tipoCorrecto = scanner.hasNextInt(); // Preguntem en el buffer si l'iput de dades introduït és de tipus concret (en aquest cas: float)

        //while (!tipoCorrecto){ // PRO VERSION
        while (tipoCorrecto == false){
            if (tipoCorrecto == false){
                System.out.println("El valor introduït no és numèric");
            }
            scanner.nextLine(); // Descarto valor
            tipoCorrecto = scanner.hasNextFloat(); // Torno a comprovar el tipatge de dades
        }
        int nombreLlegit = scanner.nextInt(); // Guardo valor a la variable
        scanner.nextLine(); // Descarto el valor del meu read perquè ja l'he guardat
        return nombreLlegit;
    }

    /**
     * Mètode per a mostrar el menú
     * @return
     */
    private String getMenuOption() {
        System.out.println("[1] Sumar\n" +
                "[2] Restar\n" +
                "[3] Multiplicar\n" +
                "[4] Dividir");
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }
}