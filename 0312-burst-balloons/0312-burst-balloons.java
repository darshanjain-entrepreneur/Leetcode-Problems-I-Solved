class Solution {
    public int maxCoins(int[] nums) {
        
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(1);
        
        for(int i = 0; i < nums.length; i++){
            
            ans.add(nums[i]);
        }
        int dp[][] = new int[nums.length + 1][nums.length + 1];
        for(int rows[] : dp){
            Arrays.fill(rows , -1);
        }
        ans.add(1);
        return f(1 , nums.length , ans , dp);
    }
    
    public int f(int i , int j , ArrayList<Integer> ans , int dp [][]){
        
        if(i > j){
            return 0;
        }
        
        int maxi = -(int)1e9;
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        
        for(int k =i; k <= j; k++){
            
            int cost = ans.get(i -1)*ans.get(j+1)*ans.get(k) + f(i , k-1 , ans , dp) + f(k+1 , j , ans ,dp);
            maxi = Math.max(maxi , cost);
        }
        return   dp[i][j] =   maxi;
    }
    
}