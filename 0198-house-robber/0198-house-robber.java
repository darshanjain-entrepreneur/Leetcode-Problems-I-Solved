class Solution {
    
    public int find(int n , int nums[] , int dp[]){
        
        if(n == 0){
            return nums[0];
        }
        if( n < 0){
            return 0;
        }
        
        if(dp[n] != -1){
            return dp[n];
        }
        
        
        int nottake = find(n -1 , nums , dp);
        int take = nums[n] + find( n -2 , nums , dp);
        
        return dp[n] = Math.max(take , nottake);
        
    }
    
    
    
    
    
    
    public int rob(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        
        
        
        int dp[] = new int[nums.length];
        Arrays.fill(dp , -1);
        
        return find(nums.length - 1 , nums , dp);
        
    }
}