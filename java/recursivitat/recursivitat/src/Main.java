import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] si = {0,1,2,3,4,5,6,7,8,9,10};

        System.out.println(sumaArgs(si));
    }

    public static int sumaArgs (int[] a){
        if (a.length == 0){
            return 0;
        }
        return a[0]+sumaArgs(Arrays.copyOfRange(a,1,a.length));
    }
}