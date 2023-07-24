class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        
        if(nums.length == 1){
            if(nums[0] == target || nums[0] == -target){
                return 1;
            }else{
                return 0;
            }
        }
        
    int dp[][] = new int[nums.length][30000];
        
        for(int row[] : dp){
            Arrays.fill(row , -1);
        }
        
        
       return find(nums.length-1 , target , nums , dp); 
        
        
        
        
        
        
    }
    
    public int find(int i , int target ,int nums[] , int dp[][] ){
        
       if(i == 0){
           
       if(target == 0 && nums[0] == 0){
           
           return 2;
       }else if(target == 0){
           return 0;
       }else if(target - nums[i] == 0 || target + nums[i] == 0){
           return 1;
       }
           
          return 0; 
       }
        
         if(target >= 0){
         
             if(dp[i][target] != -1){
                 return dp[i][target];
             }
             
             
        }else{
            
        int a = -target +2001;
          if(dp[i][a] != -1){
              return dp[i][a];
          }
        }
     
        
        
        int positive = find(i-1 , target+nums[i] , nums , dp);
        int negative = find(i-1 , target-nums[i] , nums , dp);
        
        
        if(target >= 0){
            dp[i][target] = positive+negative;
        }else{
            
        int a = -target +2001;
            dp[i][a] = positive+negative;
        }
        
        return positive+negative;
      
        
        
  
        
        
    }
}