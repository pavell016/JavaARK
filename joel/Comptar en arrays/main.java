import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //variabes
        Scanner input  = new Scanner(System.in);
        int torres = input.nextInt();
        ArrayList<Integer> result = new ArrayList<Integer>();

        for (int i = 0; i <= torres-1 ; i++) {
            int longitud = input.nextInt();
            input.nextLine();
            int[] list = new int[longitud];
            String aux = input.nextLine();
            String[] aux2 = aux.split(" ");
            for (int j = 0; j < longitud; j++) {
                list[j]=Integer.valueOf(aux2[j]);
            }
            int abuscar = input.nextInt();
            int count=0;
            for (int n : list){
                if (n == abuscar){
                    count++;
                }
            }
            result.add(count);
        }
        for (int i : result){
            System.out.println(i);
        }
    }
}