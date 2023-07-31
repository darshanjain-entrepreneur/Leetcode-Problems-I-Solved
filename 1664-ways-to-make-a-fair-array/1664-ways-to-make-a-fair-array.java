class Solution {
    public int waysToMakeFair(int[] nums) {
        
        int even = 0;
        int odd = 0;

     int evensum[] = new int[nums.length];
        int oddsum[] = new int[nums.length];
        
     for(int i = 0; i < nums.length; i++){
         
         if(i%2 == 0){
             even  = even + nums[i];
             
         }else{
             
             odd = odd + nums[i];
         }
         
         oddsum[i] = odd;
         evensum[i] = even;
         
     } 
        
        int max = Math.max(even , odd);
        
  
        
      
        
      return   findsum(even , odd , -1 , nums , oddsum , evensum);
        
    }
    
    
    public int findsum(int even , int odd ,int num , int nums[] , int oddsum[] , int evensum[]){
        
       if(even == odd && num != -1){
           return 1;
       }else if(num != -1){
           return 0;
       }
        
      int n = nums.length;
        
        int max = 0;
       
        for(int i = 0; i < nums.length; i++){
            
         
            if(i%2 == 0){
                
     max = max + findsum(evensum[i] - nums[i] +  oddsum[n-1] - oddsum[i] , evensum[n-1]- evensum[i]+
                oddsum[i] , i ,nums , oddsum , evensum);           
                
            }else{
                
         max = max + findsum(evensum[i] + oddsum[n-1] - oddsum[i] , evensum[n-1]- evensum[i]+
                oddsum[i] - nums[i] , i, nums ,oddsum , evensum );            
                
                
            }
          
            
            
            
            
        }
        
      
        
    
     return   max;
        
        
        
    }
    
    
    
    
}