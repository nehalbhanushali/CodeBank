/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geeksforgeekscoding;

/**
 *
 * @author nehal
 */
public class GeeksForGeeksCoding {

    /**
     * @param args the command line arguments
     */
 
    
    
           
/*
PAYPAL IS HIRING

P   P
A P A
Y   L

Output - PP..APA..YL..

n = 3
*/

/*
Approach 1 : Using Single String 1D array 

PAH
APLS
YI
*/

    /*
public static void main(String args[]){
    
    String inpStr = "PAYPALISHIRING";
    
    
    String outPut = printZigZag(inpStr, 3)
    
}

String printZigZag(String s, int n){
    
    String arr[] = new String[n];
    
    
    
    if(n==1)
        return s;
    
    int idx =0;
    boolean down = true;
    //StringBuffer sbs[] = new StringBuffer[n];
    for(int i=0;i <s.length();i++){
        
        arr[idx] += String.valueOf(inpStr.charAt(i)); // n+1 string
        //sb[idx] = sb[idx].append(inpStr.charAt(i));
        
        if(idx == 0){
            
            idx++;
            down = true;
            
        }
        
        else if(idx == n-1){
            idx--;
            down = false;
            
        }
        else if (idx < n-1){
            
            if(down)
                idx++;
            else
                idx--;
        }  
        
    }
    
    String output = "";
    for(int i = 0; i< n;i++){
        
     outPut+=arr[i];   // n+1
        
        
    }    
 
 }  
    
}
/* Solution 2 : using String 2D array / matrix

P x x x A x x x H x x x N x
x A x P x L x S x I x I x G
x x Y x x x I x x x R x x x

   public static void main(String[] args) {
        // TODO code application logic here
        
            int n = 3;
	    String inputStr = "GEEKSFORGEEKS";
	    String outputStr = "GSGSEKFREKEOE";
            String myOutput ="";
            //base case
            if (n==1){
             myOutput = inputStr ; 
            }
            else{
	    String[][] zigZagMatrix = new String[n][inputStr.length()];
            int i=0,j= 0;
            boolean down = true;
            
            while (j<inputStr.length()){
                  System.out.print(i+" "+j+"  "+down+" ");
                  zigZagMatrix[i][j] = String.valueOf(inputStr.charAt(j));
                  System.out.println( zigZagMatrix[i][j]);
                  if(i==0){
                      i++;
                      down=true;
                       System.out.println("here>>>1");
                  }
                  else if(i<n-1)
                  {
                      if(down)
                          i++;
                      else
                          i--;
                       System.out.println("here>>>2");
                  }
                  else if(i==n-1)
                  {
                   i--;
                   down = false;
                   System.out.println("here>>>3");
                         
                  }
                  j++; 
                 
            }
            
            
	    
           // printMatrix(zigZagMatrix);
           
            for(int k=0 ; k<n;k++){
                for(int l=0;l<zigZagMatrix[0].length;l++){
                    
                   myOutput+= zigZagMatrix[k][l] !=null ? zigZagMatrix[k][l] : "";
                }
            }
	  System.out.println(myOutput.equals(outputStr));  
      }
    }
    
    public static void printMatrix(String[][] str){
        
        for(int i = 0 ; i < str.length;i++){
            
            for (int j = 0; j< str[0].length; j++){
                
                System.out.print(str[i][j]+ " ");
            }
            System.out.println();
        }
    }

*/
