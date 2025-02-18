package exercices;

import java.util.Scanner;

public class lastWordLength {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] frase = input.next().split("\\s");
        int ultim = frase.length-1;
        System.out.println(frase[ultim].length());
    }
}
