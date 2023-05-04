class Solution {
    public int maxProfit(int[] prices) {
        
        int n = prices.length;
        
        int cur[] = new int[2];
        int next[] = new int[2];
        
     
    for(int i = n-1; i>= 0; i--){
        
        
        for(int j = 0; j<= 1; j++){
            
            
            int profit = 0;
            
            if(j == 1){
                
                profit = Math.max(-prices[i] + next[0] ,next[1] );
            }else{
                
                 profit = Math.max(prices[i] +next[1] ,next[0] );
            }
            
           cur[j] = profit;
        }
        next = cur;
    }
        
        return next[1];
        
        
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