class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        
        int n = grid.length;
        
        int row[] = new int[n];
        int col[] = new int[n];
        
        
        for(int i = 0; i < n; i++){
            int max  = 0;
            for(int j = 0; j < n; j++){
                
                max = Math.max(grid[i][j] , max);
                
                
            }
            
            row[i] = max;
        }
        
        
            for(int i = 0; i < n; i++){
            int max  = 0;
            for(int j = 0; j < n; j++){
                
                max = Math.max(grid[j][i] , max);
                
                
            }
            
            col[i] = max;
        }
        
        int sum = 0;
            for(int i = 0; i < n; i++){
         
            for(int j = 0; j < n; j++){
                
             if(row[i] <= col[j]){
                 
                 sum = sum + row[i] - grid[i][j];
             }else{
                 
                 sum = sum + col[j]-grid[i][j];
                 
             }
                
                
            }
            
           
        }
        
        
        
        
        return sum;
        
        
    }
}