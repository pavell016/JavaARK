import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int entry = input.nextInt();
        input.nextLine();
        ArrayList<String> res = new ArrayList<String>();
        for (int i = 0; i < entry; i++) {
            int entry2= input.nextInt();
            if (entry2 <=0){
                res.add("ELS NOMBRES NATURALS COMENCEN EN 1");
            }else {
                int total1=0, total2=1;
                for (int j = 1; j <= entry2; j++) {
                    total1+=j;
                    total2*=j;
                }
                res.add("SUMA: "+total1+" PRODUCTE: "+total2);
            }
        }
        for (String i : res){
            System.out.println(i);
        }


    }
}