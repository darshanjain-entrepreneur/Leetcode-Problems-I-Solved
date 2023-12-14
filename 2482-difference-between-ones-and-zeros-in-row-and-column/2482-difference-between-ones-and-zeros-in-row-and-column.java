class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        
        
        int onerow[] = new int[grid.length];
        
        int onecol[] = new int[grid[0].length];
           int zerorow[] = new int[grid.length];
        
        int zerocol[] = new int[grid[0].length];
        
        for(int i = 0; i < grid.length; i++){
            
            for(int j = 0; j < grid[0].length; j++){
                
                
                if(grid[i][j] == 1){
                    onerow[i]++;
                    onecol[j]++;
                }else{
                    
                zerorow[i]++;
                    zerocol[j]++;
                    
                }
                
            }
        }
        
     
        
        for(int i = 0; i < grid.length; i++){
            
            for(int j = 0; j < grid[0].length; j++){
                
                
                grid[i][j] = onerow[i]+onecol[j] - zerorow[i] - zerocol[j];
                
                
            }
        }
        
        
        return grid;
        
        
        
    }
}