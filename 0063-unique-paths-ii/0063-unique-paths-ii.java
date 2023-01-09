class Solution {
    
    public int find(int n , int m , int dp[][] , int obstacleGrid[][]){
        if(n == 0 && m== 0){
            if(obstacleGrid[n][m] == 0){
                return 1;
            }else{
                return 0;
            }
        }
        
        if(n <0 || m < 0){
            return 0;
        }
        
        if(dp[n][m] != -1){
            return dp[n][m];
            
        }
        if(obstacleGrid[n][m] == 1){
            return 0;
        }
        
        
        int left = find(n , m -1 , dp , obstacleGrid);
        int up = find( n -1 , m , dp , obstacleGrid);
        
        return dp[n][m] = left + up;
    }
    
    
    
    
    
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int n = obstacleGrid.length;
        int m = obstacleGrid[0].length;
        
        int dp[][] = new int[n][m];
        for(int rows[] : dp){
            Arrays.fill(rows , -1);
        }
        
        return find(n-1 , m-1 , dp , obstacleGrid);
        
    }
}