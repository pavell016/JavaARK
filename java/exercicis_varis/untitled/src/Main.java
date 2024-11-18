import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Scanner input = new Scanner(System.in);
        String cadena = input.nextLine();
        String aux = "";
        String procesados = "";

        for (int i = 0; i < cadena.length(); i++) {
            int count = 0;
            char actual = cadena.charAt(i);

            if (procesados.indexOf(actual) == -1) {
                for (int j = 0; j < cadena.length(); j++) {
                    if (cadena.charAt(j) == actual) {
                        count++;
                    }
                }
                if (aux.equals("")) {
                    aux += "{'" + actual + "':" + count;
                } else {
                    aux += ",'" + actual + "':" + count;
                }
                procesados += actual;
            }
        }

        aux += "}";
        System.out.println(aux);

         */
        Scanner input = new Scanner(System.in);
        int longitud = input.nextInt();
        int[][] matr = new int[longitud][longitud];
        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr[i].length; j++) {
                if (i==j){
                    matr[i][j]=1;
                }else{
                    matr[i][j]=0;
                }
            }
        }
        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr[i].length; j++) {
                System.out.print(matr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
