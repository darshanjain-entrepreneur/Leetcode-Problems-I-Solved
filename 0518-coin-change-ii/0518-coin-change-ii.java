class Solution {
    public int change(int amount, int[] coins) {
        
        int n = coins.length;
        int dp[][] = new int[coins.length ][amount + 1];
        
        for(int rows[] : dp){
            Arrays.fill(rows , -1);
        }
        
        return find(n-1 , amount , coins , dp);
        
    }
    
    public int find(int i , int amount , int coins[] , int dp[][]){
        
        
        if(i == 0){
          if(amount % coins[i] == 0){
              return 1;
          }else{
              return 0;
          }
            
        }
        if(dp[i][amount] != -1){
            return dp[i][amount];
        }
        
        
        
        int notpick = 0 + find(i -1 , amount , coins , dp);
        
        int pick = 0;
        
        if(coins[i] <= amount){
            pick =  find(i  , amount - coins[i] , coins , dp);
        }
        
        return dp[i][amount] =  pick + notpick;
        
    }
}