class Solution {
    public int maxProfit(int[] prices) {
        
        int n = prices.length;
        
        int dp[][] = new int[prices.length + 1][2];
        
     
    for(int i = n-1; i>= 0; i--){
        
        
        for(int j = 0; j<= 1; j++){
            
            
            int profit = 0;
            
            if(j == 1){
                
                profit = Math.max(-prices[i] + dp[i+1][0] ,dp[i+1][1] );
            }else{
                
                 profit = Math.max(prices[i] + dp[i+1][1] ,dp[i+1][0] );
            }
            
            dp[i][j] = profit;
        }
    }
        
        return dp[0][1];
        
        
    }
    
    public int find(int i , int prices[] , int n , int buy , int dp[][]){
        
        if(i >= n){
            return 0;
        }
        
        int profit = 0;
        
        if(dp[i][buy] != -1){
            return dp[i][buy];
        }
        
        if(buy == 1){
            
            profit =    Math.max(- prices[i] + find(i + 1 , prices , n , 0 , dp) , find(i + 1 , prices , n , 1 , dp));
            
        }else{
            
            profit = Math.max(prices[i] + find(i + 1 , prices , n , 1 , dp) , find(i + 1 , prices , n , 0 , dp));
            
            
        }
        
        
        
        return dp[i][buy] =  profit;
        
    }
}