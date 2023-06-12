class Solution {
    public int maximalSquare(char[][] matrix) {
        
        int max = 0;
        int n = matrix.length;
        int m = matrix[0].length;
        int dp[][] = new int[n+1][m+1];
        
        for(int i = n-1; i >= 0; i--){
            
            for(int j = m-1;j >= 0; j--){
                
                
             int  right = dp[i][j+1];;
            int down = dp[i+1][j];
                int diagonal  = dp[i+1][j+1];
                
                
            if(matrix[i][j] == '1'){
                
                int ans = 1 + Math.min(right , Math.min(down , diagonal));
                max = Math.max(max , ans);
                dp[i][j] = ans;
                
            }else{
                
                dp[i][j] = 0;
            }    
                
                
                
                
            }
            
        }
            
        return max*max;
    }
}