class Solution {
    public int largestSubmatrix(int[][] matrix) {
        
        int prevrow[] = new int[matrix[0].length];
        
        
        
        
        int n = matrix.length;
        int m = matrix[0].length;
        int ans = 0;
        
        for(int i = 0;  i< n; i++){
            
            int currRow[] = new int[m];
            
           for(int j = 0;  j< m; j++){
               currRow[j] = matrix[i][j];
           }
            
            
            for(int j = 0;  j< m; j++){
                
                if(currRow[j] != 0){
                    
                    currRow[j]+=prevrow[j];
                }
                
            }
            
        ArrayList<Integer> sorted = new ArrayList<>();
            
            for(int j = 0; j < m; j++){
                sorted.add(currRow[j]);
            }
          Collections.sort(sorted , (a,b)->{
              
              return b-a;
          });
            
              
              for(int j = 0; j < m; j++){
                  
                  ans = Math.max(ans , sorted.get(j)*(j+1));
              }
            
            
            for(int j = 0;  j<m;j++){
                
                prevrow[j] =currRow[j];
            }
            

            
        }
        
        
        return ans;
    }
}