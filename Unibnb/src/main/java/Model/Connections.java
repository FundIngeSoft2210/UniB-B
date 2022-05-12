/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.*;

public class Connections {
   public static Connection getcon(){
    System.out.println("Hello World!");
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String conUrl="jdbc:sqlserver://DESKTOP-MTG1C55:1433;databaseName=Unibnb";
            Connection con = DriverManager.getConnection(conUrl,"usuarioSQL","123");
            System.out.println("goool");
            return con;
        }catch(ClassNotFoundException e){
            System.out.println(e);
            return null;
        }catch(SQLException e){
            System.out.println(e);
            return null;
        }
   }
}
