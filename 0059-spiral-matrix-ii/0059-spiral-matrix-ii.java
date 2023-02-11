class Solution {
    public int[][] generateMatrix(int n) {

      int ans[][] = new int[n][n];
        
        
        
        
          
        int rows = ans.length;
        if(rows == 0){
            return ans;
        }
        
        // no of cols
        int cols = ans[0].length;
        int k = 1;
        
        int top = 0; int left = 0; int right = cols - 1; int bottom = rows-1;int dir = 0;
        
        while(left <= right && top <= bottom){
            
            if(dir == 0){
                for(int i = left; i <= right; i++){
                    
                    ans[top][i] = k;
                    k++;
                }
                dir = 1;
                top++;
            }else if(dir == 1){
                
                for(int i = top; i <= bottom; i++){
                    ans[i][right] = k;
                    k++;
                }
                dir = 2;
                right--;
            }else if(dir == 2){
                
                for(int i = right; i >= left; i--){
                    ans[bottom][i] = k;
                    k++;
                }
                dir = 3;
                bottom--;
                
            }else{
                for(int i = bottom; i>= top; i--){
                    
                    ans[i][left] =k;
                    k++;
                }
                dir = 0;
                left++;
                
            }
            
            
            
            
            
        }
        
        
        return ans;
        
        
    }
}