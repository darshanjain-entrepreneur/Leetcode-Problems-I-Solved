class Solution {
    public int change(int amount, int[] coins) {
        
        int n = coins.length;
        int dp[][] = new int[coins.length ][amount + 1];
        
     for(int i = 0; i < n; i++){
         
         dp[i][0] = 1;
     }
        
      for(int j = 0; j <= amount; j++){
          
          if(j % coins[0] == 0){
              dp[0][j] = 1;
          }
      }
       
        for(int i = 1; i < n; i++){
            
            
            for(int j = 0; j <= amount; j++){
                
                int notpick = dp[i-1][j];
                int pick = 0;
                if(coins[i] <= j){
                    pick = dp[i][j - coins[i]];
                }
                dp[i][j] = pick + notpick;
            }
        }
        
        return dp[n-1][amount];
        
    }
    
    public int find(int i , int amount , int coins[] , int dp[][]){
        
        if(amount == 0){
            
            return 1;
        }
        
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