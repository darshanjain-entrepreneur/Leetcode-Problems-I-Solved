class Solution {
    public int[][] diagonalSort(int[][] mat) {
        
        
        for(int i = 0; i < mat.length; i++){
            
            for(int j = 0; j < mat[0].length; j++){
                
               int x = i;
                int y = j;
               int row = i;
                int col = j;
               ArrayList<Integer> ll = new ArrayList<>();
                while(row < mat.length && col < mat[0].length ){
                    
                   ll.add(mat[row][col]);
                    row = row+1;
                    col = col +1;
                }
                
                Collections.sort(ll);
                int k = 0;
                 while(x < mat.length && y < mat[0].length ){
                    
                   mat[x][y]  = ll.get(k);
                     x++;
                     y++;
                   k++;
                }
                
                
                
                
                
            }
            
            
            
            
            
        }
        
        
        
        return mat;
        
        
    }
}