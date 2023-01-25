class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length == 1){
            return 0;
        }
   
        int buy = 0;
        int sell = 0;
        int profit = prices[sell] - prices[buy];
        while(buy <= sell && sell < prices.length){
            
            if(prices[sell] - prices[buy] < 0){
                
                buy = sell;
            }else{
                
                profit = Math.max(profit , prices[sell] - prices[buy]);
                sell++;
                
                
                
                
            }
            
            
            
            
            
        }
        
        return profit;
        
    }
}