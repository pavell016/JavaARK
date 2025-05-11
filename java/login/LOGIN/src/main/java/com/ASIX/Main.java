package com.ASIX;


import java.sql.*;
import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    static String url = "jdbc:mysql://localhost:3306/login_users";
    static String user = "root";
    static String pass = "";
    public static void main(String[] args) {
        try {
            Connection conn = Connect(url,user,pass);
            init_menu(conn);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public static Connection Connect(String url, String user, String pass) throws SQLException {
        return DriverManager.getConnection(url,user,pass);
    }
    public static void init_menu(Connection conn){
        System.out.println("1-Login" +"\n"+
                                   "2-Registre\n" +
                                   "3-Exit");
        String option = input.nextLine();
        switch (option){
            case "1":
                if(Login(conn)){
                    System.out.println("login successfull");
                }else{
                    System.out.println("NO LOGIN :(");
                }
                init_menu(conn);
                break;
            case "2":
                Register(conn);
                init_menu(conn);
                break;
            case "3":
                break;
            default:
                System.out.println("invalid option");
                break;
        }
    }
    public static boolean Login(Connection conn){
        System.out.println("Usuari:");
        String username = input.nextLine();
        System.out.println("Contrassenya");
        String passwd = input.nextLine();
        String login = "select userName, passwd from login_users.users where userName = '"+username+"' and passwd = '"+passwd.hashCode()+"';";
        System.out.println(login);
        Statement stmt = null;
        try {
            stmt = conn.prepareStatement(login);
            ResultSet res = stmt.executeQuery(login);
            if (res.next()){
                String bd_user = res.getString("userName");
                String bd_passwd = res.getString("passwd");
                passwd=String.valueOf(passwd.hashCode());
                if (username.equals(bd_user) && bd_passwd.equals(passwd)){
                    return true;
                }else{
                    return false;
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return false;
    }
    public static void Register(Connection conn) {
        System.out.print("Username: ");
        String username = input.nextLine();
        System.out.print("Password: ");
        String password1 = input.nextLine();
        System.out.print("Repeat Password: ");
        String password2 = input.nextLine();

        if (!password1.equals(password2)) {
            System.out.println("Passwords do not match. Try again.");
            return;
        }

        String insert = "INSERT INTO users (userName, passwd) VALUES (?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(insert)) {
            stmt.setString(1, username);
            stmt.setString(2, String.valueOf(password1.hashCode())); // insecure; replace with secure hash

            int rowsAffected = stmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("User registered successfully.");
            } else {
                System.out.println("Registration failed.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}