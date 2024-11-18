import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        boolean program = true;
        String[][] botiga = new String[50][4];
        int count=0;
        while (program){
            //menu
            System.out.println("Benvingut a la botiga de productes 5000\n" +
                                       "sisplau escolliu una opció\n" +
                                       "1- Afegir un producte\n" +
                                       "2- Mostrar inventari\n" +
                                       "3- Mostrar productes segons ID\n" +
                                       "4- Sortir");
            int option = input.nextInt();
            input.nextLine();

            //opcions segons tria
            switch (option){
                case 1:             // Afegir un producte
                    System.out.println("Sisplau introduiu el nom del producte seguit per el seu preu i la cuantitat que voleu afegir");
                    String product = input.nextLine();
                    String[] APaux = product.split(" ");
                    //afegir productes a la següent posicio que esta buida
                    for (int row = 0; row < botiga.length; row++) {
                        if (botiga[count][0]==null){
                            botiga[row][0]=String.valueOf(row);
                            botiga[row][1]=APaux[0];
                            botiga[row][2]=APaux[1];
                            botiga[row][3]=APaux[2];
                        }else {
                            break;
                        }
                    }

                    break;
                case 2:             // Mostrar inventari
                    System.out.println("ID\t\tPRODUCTE\t\tPREU\t\tQUANTITAT");
                    for (int i = 0; i < botiga.length; i++) {
                        if (botiga[i][0]==null){
                            break;
                        }else{
                            for (int j = 0; j < botiga[i].length; j++) {
                                if (j==0 ){
                                    System.out.print(botiga[i][j]+"\t\t");
                                }else{
                                    System.out.print(botiga[i][j]+"\t\t\t");
                                }

                            }
                            System.out.println();
                        }

                    }
                    break;
                case 3:             //Mostrar productes segons ID
                    System.out.println("Introduiu el ID del producte que voleu consultar");
                    String MPID= input.nextLine();
                    System.out.println("ID\t\tPRODUCTE\t\tPREU\t\tQUANTITAT");
                    for (int i = 0; i < botiga.length; i++) {
                        for (int j = 0; j < botiga[i].length; j++) {
                            if (botiga[i][0].equals(MPID)){
                                if (j==0 ){
                                    System.out.print(botiga[i][j]+"\t\t");
                                }else{
                                    System.out.print(botiga[i][j]+"\t\t\t");
                                }
                            }else {
                                break;
                            }

                        }
                        if (botiga[i][0].equals(MPID)){
                            System.out.println();
                        }
                    }
                    break;
                case 4: //sortir del programa
                    program=false;
                    break;
            }

        }

    }
}