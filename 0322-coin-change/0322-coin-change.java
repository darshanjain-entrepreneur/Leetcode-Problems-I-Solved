class Solution {
    public int coinChange(int[] nums, int amount) {
        
         int dp[][] = new int[nums.length][amount + 1];
      for(int rows[] : dp){
          Arrays.fill(rows , -1);
      }
      
     int ans = find(nums.length - 1 , amount , nums, dp);
      
      if(ans >= (int)1e9){
          return -1;
      }else{
          return ans;
      }
    }
    
    
       public int find(int i , int amount , int nums[] , int dp[][]){
        
        if(i == 0){
            
            if(amount % nums[i] == 0){
                return amount/nums[i];
            }else{
                return (int)1e9;
            }
            
            
            
            
        }
        
        
        if(dp[i][amount] != -1){
            return dp[i][amount];
        }
        
        int notpick = 0 + find(i -1 , amount , nums , dp);
        
        int pick = (int)1e9;
        
        if(nums[i] <= amount){
            
            pick = 1 + find(i  , amount - nums[i] , nums , dp);
        }
        
        
        return dp[i][amount] =  Math.min(pick , notpick);
       }
}