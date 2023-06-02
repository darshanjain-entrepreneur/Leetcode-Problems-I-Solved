class Solution {
    public void gameOfLife(int[][] board) {
        
    
        int n = board.length;
        int m = board[0].length;
        
    
        
        int drow[] = {-1 , 0 , 1 , 0 ,1 , -1 , 1 , -1};
        int dcol[] = {0 , 1 , 0 ,-1 , 1 , -1 ,-1 , 1 };
        
        for(int i = 0; i < n; i++){
            
            for(int j = 0;  j < m; j++){
                int count = 0;
                
                for(int k  = 0; k < 8; k++){
                    
                    int nrow = i + drow[k];
                    int ncol = j + dcol[k];
                    
                    if(nrow >= 0 && nrow < n && ncol >= 0 && ncol < m && (board[nrow][ncol] == 1 || board[nrow][ncol] == 2 ) ){
                        count++;
                    }
                    
                    
                }
                
                if(board[i][j] == 1){
                    
                    if(count < 2 || count >3){
                      board[i][j] = 2;
                    }
                }else{
                    
                    if(count == 3){
                        board[i][j] = 3;
                    }
                }
                
                
            }
        }
        
        
        
      for(int i = 0; i < n; i++){
          for(int j = 0;j < m; j++){
              if(board[i][j] == 2 || board[i][j] == 3){
                  board[i][j] = board[i][j]%2;
              }
          }
      }
        
        
    }
}