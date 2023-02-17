class Solution {
    public int rob(int[] nums) {
        
      
        
    int prev1 = nums[0];
     
    int prev2 = 0;
        
        for(int i = 1;i < nums.length; i++){
            
            int takenot =  prev1;;
            
            int take= nums[i];
            if(i > 1){
                
                take = take + prev2;
            }
            
            int cur = Math.max(takenot , take);
            prev2 = prev1;
            prev1 = cur;
            
            
            
            
            
        }
        return prev1;
    }
}