class Solution {
    
    
    public void dfs(int row , int col ,int[][] grid ,  boolean[][] vis , int drow[] , int dcol[]){
        
        vis[row][col] = true;
        
        int n = grid.length;
        int m = grid[0].length;
        
        for(int i = 0; i < 4; i++){
            
            int r = row + drow[i];
            int c = col + dcol[i];
            
            
            if(r >= 0 && r < n && c >= 0 && c < m && vis[r][c] == false && grid[r][c] == 1){
                
                dfs(r , c , grid , vis , drow , dcol);
            }
            
            
            
        }
        
        
        
        
        
        
        
    }
    
    
    
    
    
    
    public int numEnclaves(int[][] grid) {
        
        int n = grid.length;
        int m = grid[0].length;
        
        boolean vis[][] = new boolean[n][m];
        int drow[] = {-1 , 0 , 1 , 0};
        int dcol[] = {0 , -1 , 0 , 1};
        
        
        // rowwsie
        for(int j = 0; j < m; j++){
            
            if(vis[0][j] == false){
                
                if(grid[0][j] == 1){
                    
                    dfs(0 , j , grid , vis , drow , dcol);
                }
            }
        }
                
            
            for(int j = 0; j < m; j++){
                
                if(vis[n-1][j] == false){
                    
                    if(grid[n-1][j] == 1){
                        dfs(n-1 , j , grid , vis , drow , dcol);
                    }
                }
            }
            
            
        
        // columwise
        
        for(int i = 0; i < n; i++){
            
            if(vis[i][0] == false){
                
                if(grid[i][0] == 1){
                    dfs(i , 0 , grid , vis , drow , dcol);
                }
            }
            
            
            
        }
        
        
        
        
        
        
         for(int i = 0; i < n; i++){
            
            if(vis[i][m-1] == false){
                
                if(grid[i][m-1] == 1){
                    dfs(i , m-1 , grid , vis , drow , dcol);
                }
            }
            
            
            
        }
        
        
        int ans = 0;
        for(int i = 0; i <n; i++){
            
            for(int j = 0; j < m; j++){
                
                if(vis[i][j] == false && grid[i][j] == 1){
                    ans++;
                }
            }
        }
        
        
        return ans;
        
        
    }
}