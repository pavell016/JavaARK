import java.util.Scanner;

/*
Los objetivos de este ejercicio son:
     Trabajar con la clase StringBuilder
     Definir métodos propios
     Llamar a métodos propios
     Crear aplicación modular
Desarrolla un programa modular en Java que pida al usuario dos valores y seguidamente muestre el
menú:
[1] Suma
[2] Resta
[3] Multiplicación
[4] Mostrar logs
[5] Salir
Cuando el usuario escoja una operación ([1] Suma, [2] Resta, [3] Multiplicación), se mostrará el
resultado del cálculo y se volverá a mostrar el menú. Implementar un método por cada operación.
Cuando el usuario seleccione [4] Mostrar logs, se le mostrará la lista de acciones que ha realizado
con la aplicación. Cuando el usuario seleccione [5] Salir el programa terminará
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StringBuilder log = new StringBuilder();
        System.out.println("Introdueix un numero decimal");
        double num1 = input.nextDouble();
        log.append("Introduit numero: "+num1+"\n");
        System.out.println("Introdueix un altre numero decimal");
        double num2 = input.nextDouble();
        log.append("Introduit numero: "+num2+"\n");
        boolean pr = true;
        while (pr){

            System.out.println("[1] Suma\n" +
                                   "[2] Resta\n" +
                                   "[3] Multiplicación\n" +
                                   "[4] Mostrar logs\n" +
                                   "[5] Salir");
            int option = input.nextInt();
            switch (option){
                case 1:
                    System.out.println(sumar(num1,num2));
                    log.append("Sumar numeros\n");
                    break;
                case 2:
                    System.out.println(restar(num1,num2));
                    log.append("Restar numeros\n");
                    break;
                case 3:
                    System.out.println(multiplicar(num1,num2));
                    log.append("multiplicr numeros\n");
                    break;
                case 4:
                    System.out.println(log);
                    log.append("mostrar logs\n");
                    break;
                case 5:
                    pr=false;
                    break;
                default:
                    break;
            }
        }
    }

    public static double sumar(double first, double second){
        return first+second;
    }
    public static double restar(double first, double second){
        return first-second;
    }
    public static double multiplicar(double first, double second){
        return first*second;
    }
}