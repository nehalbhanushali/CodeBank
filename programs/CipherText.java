/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciphertext;

/**
 *
 * @author nehal
 */
public class Ciphertext {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        String text = "DZ";
        int s = 4;
        System.out.println("Text  : " + text);
        System.out.println("Shift : " + s);
        encrypt(text, s);
        //System.out.println("Cipher: " + encrypt(text, s));
    }
    
    public static void encrypt(String text, int s){
        StringBuffer cipherText = new StringBuffer();
        
        for (int i=0;i< text.length();i++){
           
            int ascii = (int)text.charAt(i);
            
            System.out.print(ascii+" ");

           
            
            if((ascii + s) > 90)
            {
              ascii = ascii+s-90 + 64;
              
            }
          else
            ascii = ascii+s;
            
            String c =  Character.toString ((char) ascii);
          
            System.out.print(c+" ");
            
            
        }
        
        
        
    }    
}


