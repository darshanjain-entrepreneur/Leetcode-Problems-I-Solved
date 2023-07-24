class Solution {
    public int oddCells(int m, int n, int[][] indices) {
  
     
        boolean row[] = new boolean[m];
        boolean col[] = new boolean[n];
        
        for(int i = 0; i < indices.length; i++){
            
            int rows = indices[i][0];
            int cols = indices[i][1];
            
            row[rows] = !row[rows];
            col[cols] = !col[cols];
            
            
        }
        
        int oddrow = 0;
        int evenrow = 0;
        int oddcol = 0;
        int evencol = 0;
        
        for(boolean a : row){
            
            if(a){
                oddrow++;
            }else{
                evenrow++;
            }
            
        }
        
            for(boolean a : col){
            
            if(a){
               oddcol++;
            }else{
               evencol++;
            }
            
        }
        
        
        
        return (oddrow*evencol) + (evenrow*oddcol);
        
     
    }
}