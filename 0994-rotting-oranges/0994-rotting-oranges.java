class Pair{
    
    int first;
    int second;
    int level;
    
    public Pair(int first , int second , int level){
        
        this.first = first;
        this.second = second;
        this.level = level;
    }
}






class Solution {
    public int orangesRotting(int[][] grid) {
        
        Queue<Pair> q = new LinkedList<>();
        boolean vis[][] = new boolean[grid.length][grid[0].length];
        
        for(int i = 0; i < grid.length; i++){
            
            for(int j = 0; j < grid[0].length; j++){
                
                if(grid[i][j] == 2){
                    
                    q.add(new Pair(i , j , 0));
                }
                
            }
        }
        
       
        
        int drow[] = {-1 , 0 , 1, 0};
        int dcol[] = {0 , 1 , 0 , -1  };
        
        int ans = 0;
        
        int n = grid.length;
        int m = grid[0].length;
        
        while(!q.isEmpty()){
            
            Pair cur = q.poll();
            int row = cur.first;
            int col = cur.second;
            int level = cur.level;
          vis[row][col] = true;
            
            ans = Math.max(ans , level);
            
            
            for(int i = 0 ; i< 4; i++){
                
                int nrow = row + drow[i];
                int ncol = col + dcol[i];
                
                if(nrow >= 0 && nrow < n && ncol >= 0 && ncol < m && vis[nrow][ncol] == false && grid[nrow][ncol] == 1){
                    
                    q.add(new Pair(nrow , ncol , level + 1));
                    grid[nrow][ncol] = 2;
                    
                }
                
                
            }
            
            
            
            
            
        }
        int count = 0;
        int hi = 0;
        
        for(int i = 0; i < n; i++){
            
            for(int j = 0; j < m; j++){
                
                if(grid[i][j] == 1){
                   
                    return -1;
                }
                
                if(grid[i][j] == 2){
                   hi = 1;
                }
                
            }
        }
        
        
    if(hi == 1){
        return ans;
    }else{
        
        return 0;
    }
        
        
    }
}