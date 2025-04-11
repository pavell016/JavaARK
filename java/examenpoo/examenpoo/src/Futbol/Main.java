package Futbol;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static Scanner input = new Scanner(System.in);
    public static ArrayList<String[]> personesNoregistrades = new ArrayList<String[]>();
    public static ArrayList<Entrenador> entrenador_No_registrat = new ArrayList<>();
    public static ArrayList<Equip> equips = new ArrayList<>();
    public static void main(String[] args) {

        System.out.println("Benvingut a la Lliga");
        System.out.println("Ets admin o usuari?\n" +
                                   "1-admin\n" +
                                   "2-user");
        int option = input.nextInt();
        switch (option){
            case 1:
                MenuADM();
                break;
            case 2:
                Menu();
                break;
            default:
                System.out.println("Opció no valida");
        }


    }

    public static void Menu(){
        System.out.println("1-Registrar Usuaris\n" +
                                   "2-Afegir Jugador a equip\n" +
                                   "3-Simular Partit\n" +
                                   "4- Veure Classificació\n" +
                                   "5-Consultar Estadistiques\n" +
                                   "6-Sortir");
        int option = input.nextInt();
        input.next();
        switch (option){
            case 1:
                MenuUserOPT1();
                Menu();
                break;
            case 2:
                MenuUserOPT2();
                Menu();
                break;
            case 3:
                Menu();
                break;
            case 4:
                Menu();
                break;
            case 5:
                Menu();
                break;
            case 6:
                break;
            default:
                System.out.println("Opció no valida");
                break;
        }

    }
    public static void MenuADM(){
        System.out.println("1-Registrar Entrenadors\n" +
                                   "2-Registrar Equip\n");
        int option = input.nextInt();
        switch (option){
            case 1:
                registreEntrenador();
                MenuADM();
                break;
            case 2:
                registreEquip();
                MenuADM();
                break;
            default:
                System.out.println("Opció no valida");
                break;
        }

    }

    public static void registreEntrenador(){
        try{
            String[] personaLliure=personesNoregistrades.getFirst();
            System.out.println("quin el el nivell tactic");
            input.next();
            int lvl = input.nextInt();
            entrenador_No_registrat.add(new Entrenador(personaLliure[0], Integer.parseInt(personaLliure[1]),lvl));

        }catch (Exception e){
            System.out.println(e.toString());
        }
    }
    public static Entrenador getEntrenador(String entrenador){
        for (Entrenador e : entrenador_No_registrat){
            if (e.getNom().equals(entrenador)){
                return e;
            }
        }
        return null;
    }

    public static void registreEquip(){
        System.out.println("Nom de l'equip");
        input.next();
        String nom = input.nextLine();
        System.out.println("entrenador");
        for(Entrenador e : entrenador_No_registrat){
            System.out.println(e.getNom());
        }
        String entrenador = input.nextLine();

        entrenador_No_registrat.add(new Equip(nom, getEntrenador(entrenador), new ArrayList<Jugador>()).getEntrenador());

    }

    public static void MenuUserOPT1(){
        System.out.println("Disme el nom de la persona");
        String nom = input.nextLine();
        System.out.println("Disme la edat de la persona");
        String edat = input.nextLine();
        personesNoregistrades.add(new String[]{nom, edat});
    }
    public static void MenuUserOPT2(){
        try{
            String[] personaLliure=personesNoregistrades.getFirst();
            System.out.println("disme la posició del jugador");
            String Posicio = input.nextLine();
            input.next();
            System.out.println("quna habilitat numerica li dones");
            int hab = input.nextInt();
            System.out.println("en quin equip el vols enregistrar?");
            for (Equip e : equips){
                System.out.println(e.getNom());
            }
            String equip_a_Afegir = input.nextLine();
            for (Equip e : equips){
                if (e.getNom().equals(equip_a_Afegir)){
                    e.AddPlayer(new Jugador(personaLliure[0],Integer.parseInt(personaLliure[1]),Posicio,hab));
                    break;
                }
            }
        }catch (Exception e){
            System.out.println(e.toString());
        }

    }
}