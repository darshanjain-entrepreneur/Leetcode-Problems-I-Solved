class Solution {
    
    public boolean find(int row , int col , String word , char[][] board , int n , int m , int drow[] , int dcol[] , int k , int visited[][]){
        
        
        if(k == word.length()){
            
            return true;
            
        }
     
        
        
        if(visited[row][col] == 0){
            
            if(word.charAt(k) == board[row][col]){
                
            visited[row][col] = 1;
                k = k + 1;
                
                for(int y = 0; y < 4; y++){
                    
                    int nrow = row + drow[y];
                    int ncol = col + dcol[y];
                    
                   if(nrow >= 0 && nrow < n && ncol >= 0 && ncol < m && visited[nrow][ncol] == 0){
                       
                        if(find(nrow , ncol , word , board , n , m , drow , dcol , k  , visited)){
                        return true;
                    }
                       
                       
                   }
                    
                    
                }
                
                
            }
            
            
            
            
        }
        
        if(k == word.length()){
            return true;
        }
        
        
        visited[row][col] = 0;
        return false;
        
        
        
    }
  
    
    public boolean exist(char[][] board, String word) {
        
        int n = board.length;
        int m = board[0].length;
        
        if(n*m < word.length()){
            return false;
        }
        
        
        int visited[][] = new int[n][m];
      
        
        
        
        int drow[] = {-1 , 0 , 1 , 0};
        int dcol[] = {0 , 1 , 0 , -1};
        
        
        for(int i = 0; i < n ;i++){
            
            for(int j = 0; j < m; j++){
                
                if(find(i , j ,word , board , n , m , drow , dcol , 0  , visited)){
                    
                    return true;
                    
                }
                
            }
            
        }
        
        return false;
        
    }
}