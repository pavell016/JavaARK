import java.sql.SQLOutput;
import java.util.ArrayList;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int sumT = 0;
        /* to create thearraylist that can contain various types of info */
        ArrayList<Object> lista = new ArrayList<>();
        /*add values*/
        lista.add("This is the first string");
        lista.add("This is the second string");
        lista.add(123);
        lista.add(true);

        /*itinerate through the arraylist*/
        for (int i = 0; i <= lista.size(); i++){

            switch (lista.get(i)) {
                case Integer integer -> sumT += (Integer) lista.get(i);
                case String s -> System.out.println("String value at position " + i + ": " + lista.get(i));
                case Boolean b -> System.out.println("Boolean value at position " + i + ": " + lista.get(i));
                default -> System.out.println("Total integers count value: " + sumT);
            }
        }

    }
}