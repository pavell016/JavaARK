import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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