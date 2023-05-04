class Solution {
    public int maxProfit(int[] prices) {
        
        int dp[][] = new int[prices.length + 1][2];
        
        for(int rows[] : dp){
            Arrays.fill(rows , -1);
        }
        
        return find(0 , prices , prices.length , 1 , dp);
        
        
        
        
        
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