class Solution {
    public int minCostClimbingStairs(int[] cost) {
        
        int n = cost.length;
        
        int dp[] = new int[n+1];
        
        Arrays.fill(dp , -1);
     int ans1 =    findmin(n-1 , cost,n , dp);
        
        int ans2 = findmin(n-2 , cost,n , dp);
        
        return Math.min(ans1 , ans2);
        
        
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