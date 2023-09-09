class Solution {
    public int maxSum(int[][] grid) {
        
        
        int max = 0;
        
        
        int n = grid.length;
        int m = grid[0].length;
        
        for(int i = 0; i < n; i++){
            
            for(int j = 0; j < m; j++){
                
                int sum = 0;
                boolean check = false;
                
                if(i-1 >= 0 && i +1 < n && j-1 >= 0 && j +1 < m){
                    
        sum = sum + grid[i][j] + grid[i-1][j-1] + grid[i-1][j] + grid[i-1][j+1] + 
            grid[i+1][j-1] + grid[i+1][j] + grid[i+1][j+1];
                    
                }
             max = Math.max(max , sum);
                
            }
        }
        
        
        return max;
    }
}