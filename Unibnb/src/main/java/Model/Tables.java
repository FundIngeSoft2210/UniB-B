/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author cuerv
 */
public class Tables {
    public static void main(String[] args){
        Connection con=null;
        Statement st = null;
        
        try{
        
        con=Connections.getcon();
        st=con.createStatement();
        st.executeUpdate("create table usuarios(name varchar(150),email varchar(150),password varchar(50),Tipo bit)");
        JOptionPane.showMessageDialog(null, "Table created!");
        }
        catch(Exception e){
        
            JOptionPane.showMessageDialog(null, e);
        }
        
        finally{
                 try{
                        con.close();
                         st.close();
                }
                 catch(Exception e){
                
                }
        }
    }
}
