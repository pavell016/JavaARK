import java.lang.reflect.Array;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int files = input.nextInt();
        int[][] matriu = new int[3][files];
        for (int col = 0; col < 3; col++) {
            for (int row = 0; row < files; row++) {
                matriu[col][row] = input.nextInt();
            }
        }

        //suma columnes
        int[] mes_gran={0,0,0};
        int[] mespetit={1000,10000,10000};
        int[] suma=new int[3];
        for (int col = 0; col < 3; col++) {
            for (int row = 0; row < files; row++) {
                suma[col]+=matriu[row][col];
                //trobar valor mes gran
                if (mes_gran[col]<matriu[row][col]){
                    mes_gran[col]=matriu[row][col];
                }
                if (mespetit[col]>matriu[row][col]){
                    mespetit[col]=matriu[row][col];
                }

            }
        }
        System.out.print("[");
        for (int i = 0; i < suma.length; i++) {
            System.out.print(suma[i]);
            if (i < suma.length - 1) {
                System.out.print(", "); // Añadir coma entre elementos
            }
        }
        System.out.println("]");
        System.out.print("[");
        for (int i = 0; i < mes_gran.length; i++) {
            System.out.print(mes_gran[i]);
            if (i < mes_gran.length - 1) {
                System.out.print(", "); // Añadir coma entre elementos
            }
        }
        System.out.println("]");
        System.out.print("[");
        for (int i = 0; i < mespetit.length; i++) {
            System.out.print(mespetit[i]);
            if (i < mespetit.length - 1) {
                System.out.print(", "); // Añadir coma entre elementos
            }
        }
        System.out.println("]");
    }
}