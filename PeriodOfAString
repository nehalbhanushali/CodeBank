/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codingQuestions;

/**
 *
 * @author nehal
 */
public class PeriodOfAString {

    /**
     * @param args the command line arguments
     */
  
    public static void main(String[] args) {
       
       String s= "abcabcdabcabcdabcabcdabcabcd";
       String s0="aaaaaa";
       
       int p = stringPeriod(s0);
       System.out.println("Period :: "+p);
        
    }

    
    public static int stringPeriod(String s){

        String s1= s;
        String s2= s1;
        
        for (int i=1; i <s1.length();i++){
            s2=rotate(s2);
            if(s1.equals(s2)){
                return i;
            }
        }
         
        return -1;
    }
    
    public static String rotate(String s1){
       
        String  rotS= s1;
        
        rotS = s1.substring(1)+s1.substring(0,1);
        //System.err.println("rot str : "+rotS);
        
        return rotS;
        
    }
    
}
    

