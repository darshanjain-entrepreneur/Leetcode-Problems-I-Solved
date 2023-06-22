class Solution {
    public int countNegatives(int[][] grid) {
        
      int n = grid.length;
        int m = grid[0].length;
        
        int count = 0;
        
        
        int col = 0;
        int row=n-1;
        
        
        while(col < m && row >= 0){
            
            if(grid[row][col] < 0){
                count = count + m-col;
                row--;
                
            }else{
                

                col++;
                
            }
            
            
            
            
            
        }
        
        return count;
        
    }
}