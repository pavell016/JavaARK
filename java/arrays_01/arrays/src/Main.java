import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean program =true;
        int notes=0;
        int tot=0;
        float mitg=0;
        int ex=0,no=0,be=0,su=0,in=0, md=0;
        while(program){
            int nota=input.nextInt();
            if (nota == -1){
                program = false;
                
            }

            if (nota <=3 && nota>=0){
                md++;
                notes++;
                tot+=nota;
            }
            else if (nota<5 && nota >3) {
                in++;
                notes++;
                tot+=nota;
            }
            else if (nota == 5) {
                su++;
                notes++;
                tot+=nota;
            }
            else if (nota == 6) {
                be++;
                notes++;
                tot+=nota;
            }
            else if (nota == 7 || nota ==8) {
                no++;
                notes++;
                tot+=nota;
            }
            else if (nota == 9 || nota ==10) {
                be++;
                notes++;
                tot+=nota;
            }
        }
        mitg = (float)  tot/notes;
        System.out.println("NOTES: "+notes+" MITJANA: "+mitg+
                                   " E: "+ex+" N: "+no+" B: "+be+
                                   " S: "+su+" I: "+in+" MD: "+md);

    }
}