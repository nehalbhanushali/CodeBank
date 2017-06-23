/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package portfoliolevelaltmaxsum;

/**
 *
 * @author nehal
 */
public class PortfolioLevelAltMaxSum {

    /**
     * @param args the command line arguments
     */
  
    public static void main(String[] args) {
     
        
       int[] arr = {1, 2, 3, -1, -1, 4, -1, 5,-1, -1,-1};
       long max = getMaxNehal(arr);
        
       System.out.println("max::"+max);
        
}
    private static long getMaxNehal(int[] tree) {
        
        if(tree.length == 0) return 0;
        
        long max = tree[0];
        
        if (max<0) return max;
        
        int count = 1;
        
        int idx = 1;
      
        int dig = 1;
        
        long[] summArr =new long[tree.length];
        
        summArr[0] = tree[0];
        
        while(dig>0){
            System.out.println("in loop dig in prev :"+dig);
            int sum = 0;
            int digCount = 0;
            int j=count;
            System.out.println("j:: :"+j);
            while( count <= Math.pow(2,dig)-1+j ){
                
                System.out.println("count loop :"+count);
                if(tree[count] >= 0){
                    digCount++;
                    sum += tree[count];
                }
               
                count++;
              
            }
  
            System.out.println( " digcount: "+digCount+" sum:"+sum);
            summArr[idx] = sum;
            
                
              dig = digCount;
              idx++;
        }
                   
        long evenSum =0;
        long oddSum =0;

        for (int i=0;i<summArr.length;i++)
        {
           
          if(i%2 ==0)  {
             evenSum+=summArr[i];
          }else{
             oddSum+=summArr[i];
          }
            
        }
        
        if(oddSum>evenSum){
            max=oddSum;
        }else{
            max=evenSum;
        }
        
        System.out.println("summarr >> "+summArr[0]+" "+summArr[1]+" "+summArr[2]+" "+summArr[3]);
        return max;
    }
    
}
    

