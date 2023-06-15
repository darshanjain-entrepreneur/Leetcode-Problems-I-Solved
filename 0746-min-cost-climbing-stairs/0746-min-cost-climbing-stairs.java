class Solution {
    public int minCostClimbingStairs(int[] cost) {
        
        int n = cost.length;
        
     int prev1 = cost[1];
        int cur = 0;
        int prev2 = cost[0];
        
        
        for(int i= 2; i < n; i++){
            
            
             cur = cost[i] + Math.min(prev1 , prev2);
            
            prev2 = prev1;
            prev1 = cur;
            
        }
      
               return Math.min(prev1 , prev2);
        
    }
    
    
    public int findmin(int i , int cost[] , int n , int dp[]){
     
     if(i == 1){
        return cost[1];
     }
        if(i == 0){
            return cost[0];
        }
        if(dp[i] != -1){
            return dp[i];
        }
        
        
       return dp[i] =cost[i] + Math.min(findmin(i-1 , cost , n , dp) , findmin(i-2 , cost , n , dp));
        
        
    }
    
}