class Solution {
    
    public int find(int n , int m , int grid[][] , int dp[][]){
        if(n== 0 && m == 0){
            
            return grid[0][0];
        }
        if(n <0 || m< 0){
            
            return (int)1e9;
        }
        if(dp[n][m] != -1){
            return dp[n][m];
        }
        
        
        int left = grid[n][m] + find(n , m-1 , grid , dp);
        int up = grid[n][m] + find(n-1 , m ,grid , dp);
        
        
        return  dp[n][m] =   Math.min(left , up);
        
        
    }
    
    
    
    
    
    public int minPathSum(int[][] grid) {
    int n = grid.length;
        int m = grid[0].length;
        int dp[][] = new int[n][m];
        
        for(int rows[] : dp){
            Arrays.fill(rows , -1);
        }
        
        return find(n-1 , m -1 , grid , dp);
        
        
        
    }
}