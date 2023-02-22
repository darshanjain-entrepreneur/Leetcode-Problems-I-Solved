class Solution {
    public List<List<String>> solveNQueens(int n) {
        
       
        char[][] board = new char[n][n];
        
      for(char rows[] : board){
          
          Arrays.fill(rows , '.');
      }
        
        
        List<List<String>> result = new ArrayList<>();
        
        solve(0 , board , result , n );
        
        return result;
        
        
        
        
    }
    public void solve(int i , char[][] board , List<List<String>> result  , int n){
        
        
        if(i == n){
            
            result.add(construct(board));
            return;
        }
        
        
        for(int k = 0; k < n; k++){
            
            if(check(k , i , board , n)){
                
                board[k][i] = 'Q';
                solve(i + 1 , board , result , n);
                board[k][i] = '.';
                
                
            }
            
            
            
            
        }
        
        
        
        
        
        
        
    }
    
    
    
    public boolean check(int row , int col , char[][] board , int n){
        
        
        int drow = row;
        int dcol = col;
        
        while(dcol >= 0){
            if(board[drow][dcol] == 'Q'){
                return false;
            }
        dcol--;
            
        }
        
        drow = row;
        dcol = col;
        
        while(drow >= 0 && dcol >= 0){
            
            if(board[drow][dcol] == 'Q'){
                return false;
            }
            dcol--;
            drow--;
            
        }
        
        drow = row;
        dcol = col;
        
        while(drow < n && dcol >= 0){
            
            if(board[drow][dcol] == 'Q'){
                return false;
            }
            drow++;
            dcol--;
            
        }
        
        
        return true;
        
        
    }
    
    
    public List<String> construct(char[][] board){
        
        List<String> res = new ArrayList<>();
        
        for(int i = 0; i < board.length; i++){
            
            res.add(new String(board[i]));
            
        }
        
        return res;
        
    }
    
    
}