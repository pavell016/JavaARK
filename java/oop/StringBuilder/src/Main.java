/*
Los objetivos de este ejercicio son:
     Trabajar con la clase StringBuilder
     Entender las diferencias entre String y StrinBuilder
La clase StringBuilder permite que trabajemos con cadenas de texto de forma más eficiente en
nuestras aplicaciones cuando tenemos que modificarlas de forma frecuente. A continuación puedes
ver el código de una aplicación donde a partir de una string “Dot saw I was Tod” se pretende
mostrarla de forma invertida “doT saw I was toD”. El código utiliza la clase String. ¿Puedes
mejorarlo usando StringBuilder?
 */
public class Main {
    public static void main(String[] args) {
        String palindrome = "Dot saw I was Tod";
        int len = palindrome.length();
        char[] tempCharArray = new char[len];
        char[] charArray = new char[len];
// put original string in an
// array of chars
        for (int i = 0; i < len; i++) {
            tempCharArray[i] =
                    palindrome.charAt(i);
        }
// reverse array of chars
        for (int j = 0; j < len; j++) {
            charArray[j] =
                    tempCharArray[len - 1 - j];
        }
        String reversePalindrome =
                new String(charArray);
        System.out.println(reversePalindrome);

        //stringBuilder HAHA
        StringBuilder pali = new StringBuilder("Dot saw I was Tod");
        System.out.println(pali.reverse().toString());
    }
}