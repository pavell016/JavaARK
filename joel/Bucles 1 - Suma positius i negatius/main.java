import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean program = true;
        int pos=0;
        int neg=0;
        while (program){
            int entry2= input.nextInt();
            if (entry2==0){
                program=false;
            }
            else if (entry2>0) {
                pos++;
            }else {
                neg++;
            }
        }
        if (neg == pos){
            System.out.println("IGUALS");

        }else if (neg < pos){
            System.out.println("POSITIUS");
        }else if (neg > pos){
            System.out.println("NEGATIUS");
        }


    }
}