/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.*;
import javax.swing.JOptionPane;

public class Confirmation {
    public static ResultSet getData(String query){
        Connection con=null;
        Statement st=null;
        ResultSet rs=null;
        
         try{
        
            con=Connections.getcon();
            st=con.createStatement();
            rs=st.executeQuery(query);
            return rs;
         }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
        finally{
            try{
            
            }
                catch(Exception e){
                        
                }
            }
        
    } 
}
