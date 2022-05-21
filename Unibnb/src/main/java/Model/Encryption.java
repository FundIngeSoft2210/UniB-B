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
     
      char[]s = word.toCharArray();
      char n=5;
     
    for (int i = 0; i < word.length(); i++)
    {
 
        // Stores integer value of
        // character in String N
        int a = (int)(n) - '0';
 
        // Stores ASCII value of
        // character in String S
        int b = (int)(s[i]) + a;
 
        // If b exceeds 122
        if (b > 122)
            b -= 26;
 
        // Replace the character
        s[i] = (char)(b);
    } 
        
        String encr = s.toString();
        System.out.println("tryee: " + encr);
        
    
    return encr;
    }}
    
