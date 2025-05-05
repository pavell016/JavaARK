package com.ASIX;
import java.sql.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/northwind";
        String user = "root";
        String pass = "";
        boolean program = true;
        Scanner input = new Scanner(System.in);
        try{
            Connection conn = DriverManager.getConnection(url,user,pass);
            System.out.println("conn successfull");

            while (program){
                String query_res_poss = "select count(EmployeeID) from northwind.employees;";
                Statement stmt = conn.createStatement();
                ResultSet res = stmt.executeQuery(query_res_poss);
                System.out.println("de quin empleat vols la informacio? [1-9]");
                String option = input.nextLine();
                if (option.matches("\\d{1}")){
                    String query = "select * from northwind.employees where EmployeeID = "+option+";";
                    res = stmt.executeQuery(query);

                    //rebre dades
                    while (res.next()){
                        int employeeID = res.getInt("EmployeeID");
                        String LastName = res.getString("LastName");
                        String firstName = res.getString("firstName");
                        String Title = res.getString("Title");
                        String TitleC = res.getString("TitleOfCourtesy");
                        Date BD = res.getDate("BirthDate");
                        Date HD = res.getDate("HireDate");
                        String Address = res.getString("Address");
                        String City = res.getString("City");
                        String Region = res.getString("Region");
                        System.out.println(employeeID+" "+LastName+" "+ firstName+" "+ Title+" "+TitleC+" "+BD+" "+HD+" "+Address+" "+City+" "+Region);
                    }
                    
                }else{
                    continue;
                }


            }


            conn.close();
        }catch(SQLException e){
            System.out.println(e.toString());
        }
    }
}