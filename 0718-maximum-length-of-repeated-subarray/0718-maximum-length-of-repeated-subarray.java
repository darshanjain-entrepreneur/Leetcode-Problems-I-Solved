class Solution {
    
    int max = 0;
    public int findLength(int[] nums1, int[] nums2) {
        
        int ans = 0;
        int n = nums1.length;
        int m = nums2.length;
      
        int dp[][] = new int[n+1][m+1];
        
        
        for(int i = 1;  i <= n; i++ ){
            
            
            for(int j = 1; j <= m; j++){
                
                
                if(nums1[i-1] == nums2[j-1]){
                    
                    dp[i][j] = 1 + dp[i-1][j-1];
                }else{
                    
                    dp[i][j] = 0;
                }
                
                ans = Math.max(ans , dp[i][j]);
                
            }
            
            
            
        }
        
        
        return ans;
        
    }
    
   
}