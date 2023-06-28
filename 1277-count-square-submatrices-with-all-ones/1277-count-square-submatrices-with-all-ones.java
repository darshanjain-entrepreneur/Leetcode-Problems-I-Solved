class Solution {
    
    public int find(int i , int j , int[][] matrix   , int dp[][]){
        
       if(i < 0 || i >= matrix.length || j < 0 || j >= matrix[0].length){
           
           return 0;
       } 
        
        if(matrix[i][j] == 0){
            
            return 0;
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        
     
           int right = 1+find(i , j+1 , matrix , dp );
        int down = 1 + find(i+1 , j , matrix , dp);
        
        int diagonal = 1+ find(i+1 , j+1 , matrix , dp);
        
        
        return dp[i][j] =  Math.min(right , Math.min(down , diagonal));
            
        
        
        
        
        
        
    }
    
    
    
    
    
    public int countSquares(int[][] matrix) {
        
        
        int dp[][] = new int[matrix.length+1][matrix[0].length+1];
        for(int rows[] : dp){
            Arrays.fill(rows , -1);
        }
      
        int ans = 0;
        
        for(int i = 0; i < matrix.length; i++){
            
            for(int j = 0; j < matrix[0].length; j++){
                
                
               if(matrix[i][j] != 0){
                    ans = ans + find(i , j , matrix , dp);
               }
                
                
            }
            
            
            
        }
        
       return ans; 
        
    }
}