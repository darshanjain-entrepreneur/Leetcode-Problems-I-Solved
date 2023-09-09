class Solution {
    public long maxStrength(int[] nums) {
        
       if(nums.length == 1){
           
           return nums[0];
       }
        Arrays.sort(nums);
        
        
        if(nums[nums.length-1] < 0){
            
            
           
            long ans = 1;
          if(nums.length%2 == 0){
              
              for(int i : nums){
                 ans =  ans*i;
              }
              return ans;
          }else{
              
              for(int i = 0; i < nums.length-1; i++){
                  
                ans =   ans * nums[i];
                  
              }
          }
            
            
            return ans;
            
            
            
        }else if(nums[nums.length-1] == 0){
            
            int minus = 0;
            long ans = 1;
            
            for(int i = 0; i < nums.length-1; i++){
                
               if(nums[i] == 0){
                   break;
               }else{
                   
                   if(minus%2 != 0){
                       
                       ans = ans*nums[i];
                       
                   }else{
                       
                       if(nums[i+1] < 0){
                           ans = ans*nums[i];
                       }
                      
                   }
                   
                  minus++; 
               }
                
                
                
                
            }
            
            if(minus <= 1){
                return 0;
            }else{
                
                return ans;
            }
            
            
            
        }
        
       
        
        
        
        long ans = 1;
        int minus = 0;
        
        for(int i = 0; i < nums.length-1; i++){
            
            if(nums[i] < 0){
                
               if(minus%2 != 0){
                   
                   ans = ans*nums[i];
               }else{
                   
                  if(nums[i+1] < 0){
                      ans = ans*nums[i];
                  }
                   
                   
               } 
                
               minus++; 
            }else if(nums[i] > 0){
                
               ans = ans*nums[i]; 
                
                
                
            }
            
            
        }
        
        
        
        
            ans = ans*nums[nums.length-1];
        
        return ans;
        
        
     
       
    }
        
       
}