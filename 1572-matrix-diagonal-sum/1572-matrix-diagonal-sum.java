class Solution {
    public int diagonalSum(int[][] mat) {
        
        int n = mat.length;
        if(n ==1){
            
            return mat[0][0];
            
            
        }
        
        
        
        if(n%2 == 0){
            int sum = 0;
            
            for(int i =0; i < n; i++){
                
                
                sum = sum + mat[i][i];
                
                
                
                
            }
            
            
            for(int i = 0; i < n; i++){
                
                
                sum = sum + mat[i][n-1-i];
            }
            
            return sum;
            
            
        }else{
            
            
            int sum = 0;
            
            for(int i = 0; i < n; i++){
                
                sum = sum + mat[i][i];
                
            }
            
              for(int i = 0; i < n; i++){
                
                sum = sum + mat[i][n-1-i];
                
            }
            
            n = n-1;
            sum = sum - mat[n/2][n/2];
            
            return sum;
            
        }
        
        
        
    }
}