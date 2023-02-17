class Solution {
    public int rob(int[] nums) {
        
        int dp[] = new int[nums.length];
        
    dp[0] = nums[0];
      if(nums.length > 1){
            dp[1] = Math.max(nums[0] , nums[1]);
      }
        
        for(int i = 2;i < nums.length; i++){
            
            int takenot =  dp[i - 1];
            
            int take= nums[i] + dp[i-2];
            
            dp[i] = Math.max(takenot , take);
            
            
            
            
            
            
        }
        return dp[nums.length - 1];
    }
}