class Solution {
    
    
    
    public void find(int i , int j , int area[] , int[][] grid , int n , int m){
        
        if(i < 0 || j < 0 || i >= n || j >= m){
            return;
        }
        
        
        
        
        if(grid[i][j] == 0){
            return;
        }
        
        
        int k = area[0] + 1;
        area[0] = k;
        
        grid[i][j] = 0;
        
        find(i  , j+1 , area , grid , n , m);
         find(i + 1 , j , area , grid , n , m);
         find(i -1 , j , area , grid , n , m);
         find(i , j-1 , area , grid , n , m);
        
        
        
        
        
        
    }
    
    
    
    
    
    
    
    
    public int maxAreaOfIsland(int[][] grid) {
        
        int n =  grid.length;
        int m = grid[0].length;
        int area[] = new int[1];
       int ans = 0;
        
        for(int i = 0; i < n; i++){
            
            for(int j = 0; j < m; j++){
                
                if(grid[i][j] == 1){
                    area[0] = 0;
                    
                    find(i , j , area , grid , n , m);
                   ans = Math.max(area[0] , ans); 
                    
                    
                }
                
                
            }
        }
        
        
        
        return ans;
        
        
    }
}