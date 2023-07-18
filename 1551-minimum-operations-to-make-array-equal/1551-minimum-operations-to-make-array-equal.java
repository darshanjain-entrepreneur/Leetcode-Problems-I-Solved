class Solution {
    public int minOperations(int n) {
        
        if(n == 1){
            return 0;
        }
        
        
      if(n%2 == 0){
          
        int start = 0;
          int end = n-1;
          int count = 0;
          while(start < end){
              
              int a = end*2 + 1;
              
              count = count + a-n;
              start++;
              end--;
              
          }
          
         return count; 
        
          
          
      }else{
          
           int m = n/2;
        int b = 2*m+1;
        int start = 0;
          int end = n-1;
          int count = 0;
          
          while(start < end){
              
               int a = end*2 + 1;
              
              count = count + a-b;
              start++;
              end--;
              
          }
          
          
          
          
          return count;
          
          
          
      }
        
        
       
        
        
        
        
    }
}