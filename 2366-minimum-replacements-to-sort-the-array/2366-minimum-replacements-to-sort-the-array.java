class Solution {
    public long minimumReplacement(int[] nums) {
        
        long ans = 0;
        
        
        int i = nums.length-2;
        int prev = nums[nums.length-1];
        
        while(i >= 0){
            
            
           if(nums[i] <= prev){
                 prev = nums[i];
               i--;
             
           }else{
               
        
             int parts = 0;
               
               int d =  nums[i]/prev;
              int e = nums[i]%prev;
               
               
               parts =d;
               if(e != 0){
                   parts++;
               }
             
              ans = ans + (parts-1);
               
               prev = nums[i]/(parts);
               i--;
               
               
               
               
               
               
           } 
            
            
            
            
            
            
            
            
        }
        
        
        
        
        return ans;
    }
}