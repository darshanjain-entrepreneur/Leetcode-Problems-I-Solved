class Solution {
    public boolean isPowerOfFour(int n) {
        if(n == 2147483647){
            return false;
        }
        
        if(n <= 0){
            return false;
        }
        
        if(n == 1){
            return true;
        }
        
        
      for(int j =1;(int)(Math.pow(4 , j)) <= n; j++){
          
          int a = (int)(Math.pow(4 , j));
          System.out.println(a + " " + j);
          if(a == n){
              return true;
          }
          
          
          
          
      }  
        
        
        return false;
        
        
        
        
    }
}