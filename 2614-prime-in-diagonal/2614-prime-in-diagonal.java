class Solution {
    public int diagonalPrime(int[][] nums) {
        
        int max = 0;
      for(int i = 0; i < nums.length; i++){
          
          if(nums[i][i] == 1){
              
              
          }else{
              int a = nums[i][i];
              int count = 0;
              for(int j = 2; j*j <=a; j++){
                  
                  if(a%j == 0){
                      count=1;
                      break;
                  }
                  
                  
              }
              
              if(count == 0){
                  max = Math.max(max , nums[i][i]);
              }
              
          }
          
      }  
        
      
        //second part
        
        
      for(int i = 0; i < nums.length; i++){
          
          if(nums[i][nums.length-1-i] == 1){
              
              
          }else{
             int  a = nums[i][nums.length-1-i];
              int count = 0;
              for(int j = 2; j*j <=a; j++){
                  
                  if(a%j == 0){
                      count=1;
                      break;
                  }
                  
                  
              }
              
              if(count == 0){
                  max = Math.max(max , nums[i][nums.length-1-i]);
              }
              
          }
          
      } 
        
        
        
        return max;
        
        
    }
}