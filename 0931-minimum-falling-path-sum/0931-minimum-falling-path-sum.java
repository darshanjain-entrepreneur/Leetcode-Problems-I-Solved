class Solution {
    
    public int find(int i , int j , int[][] matrix , int dp[][]){
        
        if(j < 0 || j >= matrix[0].length){
            
            return (int)1e9;
        }
        
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        
        if(i == 0){
            return matrix[i][j];
        }
        
        
        int straight = matrix[i][j] + find(i - 1 , j , matrix , dp);
        int left = matrix[i][j] + find(i - 1 , j - 1 , matrix , dp);
        int right = matrix[i][j] + find(i - 1 , j+ 1 , matrix , dp);
        
        return  dp[i][j] =   Math.min(straight , Math.min(left , right));
        
        
    }
    
    
    
    
    
    
    
    public int minFallingPathSum(int[][] matrix) {
        
      
        
    int min = Integer.MAX_VALUE;
        
        int n = matrix.length;
        int m = matrix[0].length;
        
          int dp[][] = new int[n][m];
        
        for(int rows[] : dp){
            Arrays.fill(rows , -1);
        }
        
        for(int i = 0; i < m; i++){
            
            min = Math.min(min , find(n-1 , i , matrix ,dp));
            
            
        }
        
        return min;
    
    }
}