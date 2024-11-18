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
            int parell=0,senar=0;
            for (int j = 1; j <= entry2; j++) {
               if (j %2 ==0){
                   parell+=j;
               }else {
                   senar+=j;
               }
            }
            res.add("PARELLS: "+parell+" SENARS: "+senar);

        }
        for (String i : res){
            System.out.println(i);
        }


    }
}