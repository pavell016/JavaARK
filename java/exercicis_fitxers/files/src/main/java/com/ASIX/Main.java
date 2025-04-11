package com.ASIX;


import java.io.*;
import java.nio.file.LinkPermission;
import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    static File tasques = new File("src/main/java/com/ASIX/tasques.txt");
    public static void main(String[] args) throws IOException {
        menu();
    }

    public static void menu() throws IOException {
        boolean program = true;
        System.out.println("1-Veure Tasques\n" +
                                   "2-Afegir tasca\n" +
                                   "3-Sortir");
        while (program){
            int option = input.nextInt();
            switch (option){
                case 1:
                    printar_fitxer(tasques);
                    menu();
                    break;
                case 2:
                    escriureTasca(tasques);
                    menu();
                    break;
                case 3:
                    program = false;
                    break;
                default:
                    System.out.println("opcio no valida");
            }
        }
    }

    public static void printar_fitxer(File tasques) throws IOException {
        if (!tasques.exists()){
            System.out.println("no hi han tasques");
            tasques.createNewFile();
        }else{
            try (BufferedReader reader = new BufferedReader(new FileReader(tasques))) { // 'true' para agregar contenido sin sobrescribir

                System.out.println(reader.readLine());

            } catch (IOException e) {
                System.out.println("Ocurrió un error al escribir en el archivo: " + e.getMessage());
            }
        }

    }
    public static void escriureTasca(File tasques) throws IOException {
        if (!tasques.exists()) {
            System.out.println("El fitxer de tasques no existia, s'ha creat un de nou.");
            tasques.createNewFile();
        }

        System.out.println("Escriu una tasca:");
        input.next();
        String tasca = input.nextLine();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(tasques, true))) {
            writer.write(tasca);
            writer.newLine();
        } catch (IOException e) {
            System.out.println("Ocurrió un error al escribir en el archivo: " + e.getMessage());
            throw e;
        }
    }
}