class Solution {
    
    
    public int solve(int i , int  j ,int matrix[][] , int prev , int dp[][]){
        
        if(i < 0 || j < 0 || i >=matrix.length || j>= matrix[0].length || matrix[i][j] <= prev ){
            
            return 0;
        }
        
        
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        
        
      int up = solve(i -1 , j , matrix , matrix[i][j] , dp);
        int down = solve(i + 1 , j , matrix , matrix[i][j] , dp);
        int left = solve(i , j-1 , matrix , matrix[i][j] , dp);
        int right = solve(i , j + 1 , matrix , matrix[i][j] , dp);
    
    
    return dp[i][j] = 1 + Math.max(Math.max(left , right) , Math.max(up , down));
    
    
    
    
    }
    
    
    
    public int longestIncreasingPath(int[][] matrix) {
     
        int n = matrix.length;
        int  m = matrix[0].length;
        
        
        
        int dp[][] = new int[n][m];
        
        for(int rows[] : dp){
            Arrays.fill(rows , -1);
        }
        
        int maxi = 0;
        
        for(int i = 0 ; i < n; i++){
            
            for(int j = 0; j < m; j++){
                
                maxi = Math.max(maxi , solve(i , j , matrix , -1 , dp));
                
                
            }
            
            
        }
        return maxi;
        
    }
}