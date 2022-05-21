/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author cuerv
 */
public class Decryption {
    
    public static String Dencrypti(String word){
        
        char[] chars = word.toCharArray();
        
        for (char c: chars ){
            
            c -= 5;
        }
        
        String decrypted=chars.toString();
        
        return decrypted;
    }
}
