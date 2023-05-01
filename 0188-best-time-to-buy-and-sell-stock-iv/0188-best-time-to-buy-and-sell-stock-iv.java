class Solution {
    public int maxProfit(int k, int[] prices) {
        
        int n = prices.length;
        
        
        int dp[][][] = new int[n+1][2][k+1];
        
        
        for(int i = n-1; i >= 0; i--){
            
            for(int buy = 0; buy<=1; buy++){
                
                for(int j =1; j<=k; j++){
                    
                    if(buy == 1){
                        
                    dp[i][buy][j] = Math.max(-prices[i]+ dp[i+1][0][j] , dp[i+1][1][j]); 
                    }else{
                        
                        dp[i][buy][j] = Math.max(prices[i] + dp[i+1][1][j-1] , dp[i+1][0][j]);
                    }
                    
                    
                    
                }
                
            }
            
            
        }
        
        return dp[0][1][k];
    }
}