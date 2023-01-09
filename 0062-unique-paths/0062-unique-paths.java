class Solution {
    
    public int find(int m , int n , int dp[][]){
        
        if( m== 0 && n == 0){
            
            return 1;
        }
        
        if(m < 0 || n < 0){
            return 0;
        }
        
        if(dp[m][n] != -1){
            return dp[m][n];
        }
        
        
        int left = find(m , n -1 , dp);
        int up = find(m -1 , n , dp);
        
        return dp[m][n] =  left + up;
        
        
        
        
        
    }
    
    
    
    public int uniquePaths(int m, int n) {
        
        int dp[][] = new int[m][n];
        for(int rows[] : dp){
            Arrays.fill(rows , -1);
        }
        
        return find(m - 1 , n - 1 , dp);
        
    }
}