/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author cuerv
 */
public class Encryption {
    
    public static String Encrypti(String word){
        
        char[] chars = word.toCharArray();
        
        for (char c: chars ){
            
            c += 5; // Para el ejemplo esta encryptacion es muy basica, para el nuevo tipo de encripcion se agregaria un numero random a final del text y con ese de descriptaria. 
        }
        
        String encrypted=chars.toString();
        
        return encrypted;
    }
    
}
