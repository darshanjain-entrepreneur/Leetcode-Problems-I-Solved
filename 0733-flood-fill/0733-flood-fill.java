class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        
        
        int[][] ans = image;
        
        int inicolor = ans[sr][sc];
        int delrow[] = {-1 , 0 , 1 , 0};
        int delcol[] = {0 , 1 , 0 , -1};
        
        dfs(image , ans ,sr , sc , color , inicolor , delrow , delcol);
        
        return ans;
    }
    
    
    public void dfs(int[][] image , int[][] ans , int row , int col, int color , int inicolor , int delrow[] , int delcol[]){
        
        ans[row][col] = color;
        int n = image.length;
        int m = image[0].length;
        
        
        for(int i = 0; i < 4; i++){
            
            int r = row + delrow[i];
            int c = col + delcol[i];
            
            if(r >= 0 && r < n && c >= 0 && c < m && ans[r][c] != color && image[r][c] == inicolor){
                
                dfs(image , ans , r , c  , color , inicolor , delrow , delcol);
                
            }
            
            
        }
        
        
        
        
        
        
        
        
        
    }
    
    
    
    
    
}