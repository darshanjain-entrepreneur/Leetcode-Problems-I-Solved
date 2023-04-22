class Solution {
    public int findNumberOfLIS(int[] nums) {
        
        int n = nums.length;
        int maxi = -1;
        
        int dp[] = new int[n];
        Arrays.fill(dp  ,1);
      
        int cut[] = new int[n];
          Arrays.fill(cut , 1);
        
        for(int i = 0; i < n; i++){
            
            for(int j = 0; j < i; j++){
                
                if(nums[i] > nums[j] && 1 + dp[j] > dp[i]){
                    
                    dp[i] = dp[j] + 1;
                    cut[i] = cut[j];
                }else if(nums[i] > nums[j] && 1 + dp[j] == dp[i]){
                    
                    cut[i] += cut[j];
                }
                
                
            }
            maxi = Math.max(maxi , dp[i]);
        }
        int no = 0;
        
        for(int i = 0; i < n; i++){
            
            if(dp[i] == maxi){
                no += cut[i];
            }
        }
        
        return no;
    }
}