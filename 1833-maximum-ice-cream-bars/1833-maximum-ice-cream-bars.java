class Solution {
    public int maxIceCream(int[] costs, int coins) {
        
        int n = (int)(1e5);
        
        int nums[] = new int[n+1];
        
        for(int i = 0; i < costs.length; i++){
            
            
            nums[costs[i]]++;
            
            
            
        }
        int ans = 0;

        for(int i = 0; i < nums.length; i++){
      

             if(coins -i >= 0 && nums[i] > 0){
                 
             int a = nums[i];
                 while(coins - i >= 0 && a> 0 ){
                     
                     coins = coins - i;
                     ans = ans+1;
                     a--;
                 }
                 
             }else if(coins - i < 0){
                 
                 break;
             }
            
            
            
            
        }
        
        return ans;
        
        
    }
}