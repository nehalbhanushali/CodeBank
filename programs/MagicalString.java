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

public class Solution {
    public int magicalString(int n) {
        
        int s[] = new int[n];
        int s1[] = new int[n];
         if(n==0){
            return 0 ;
        }
        if(n==1 || n==2){
            return 1 ;
        }
        int  i = 1 ,  j = 2;
        s[0] = 1;
        s1[0] = 1;
        s1[1] = 2;
        int count = 1;
       
        
        while (i<n && j < n ){
         if(s[j]==1 || s[j]==2){
            s1[j] = s[j];
            j=j+1;
        }
        if(s1[j-1] ==2){ // 2 section
            if(i<=n-2){
            if(s[i-1]==2){
                s[i]=1;
                s[i+1]=1;
                i=i+2;
                count+=2;
                
               }
               else{
                    s[i]=2;
                    s[i+1]=2;
                    i=i+2;  
                }
            }
            else{
                 if(s[i-1]==2){
                    s[i]=1;
                    i=i+1;
                    count+=1;
                }
                else{
                    s[i]=2;
                    i=i+1;  
                }
            }
            }
        else{ // 1 section
          
                if(s[i-1]==2){
                    s[i]=1;
                    i=i+1;
                    count+=1;
                }
                else{
                    s[i]=2;
                    i=i+1;
                }
                       
            }
    }
     
       printArray(s);
       System.out.print("\n");
        printArray(s1);
         return count;
    }
    
    public void printArray(int s[]){
        
        for(int i = 0 ; i < s.length;i++ ){
             System.out.print(s[i]+" ");
        }
    }
   
}

/ * Authors :  zalak shah, nehal bhanushali */
