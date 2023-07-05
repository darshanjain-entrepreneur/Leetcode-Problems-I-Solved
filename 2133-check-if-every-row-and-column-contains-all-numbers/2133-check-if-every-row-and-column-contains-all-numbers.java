class Solution {
    public boolean checkValid(int[][] matrix) {
        HashSet<Integer> set = new HashSet<>();
        int n = matrix.length;
        int m = matrix[0].length;
        
        for(int i = 0; i < n; i++){
            
            for(int j = 0; j < m; j++){
                
                set.add(matrix[i][j]);
                
            }
            
            if(set.size() != n){
                return false;
            }
            set.clear();
        }
        
        
          for(int i = 0; i < m; i++){
            
            for(int j = 0; j < n; j++){
                
                set.add(matrix[j][i]);
                
            }
            
            if(set.size() != n){
                return false;
            }
            set.clear();
        }
        
        
        
        return true;
    }
}