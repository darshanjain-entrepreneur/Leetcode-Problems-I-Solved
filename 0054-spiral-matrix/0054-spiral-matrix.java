class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> ans = new ArrayList<>();
        // no of rows
        
        int rows = matrix.length;
        if(rows == 0){
            return ans;
        }
        
        // no of cols
        int cols = matrix[0].length;
        
        int top = 0; int left = 0; int right = cols - 1; int bottom = rows-1;int dir = 0;
        
        while(left <= right && top <= bottom){
            
            if(dir == 0){
                for(int i = left; i <= right; i++){
                    
                    ans.add(matrix[top][i]);
                }
                dir = 1;
                top++;
            }else if(dir == 1){
                
                for(int i = top; i <= bottom; i++){
                    ans.add(matrix[i][right]);
                }
                dir = 2;
                right--;
            }else if(dir == 2){
                
                for(int i = right; i >= left; i--){
                    ans.add(matrix[bottom][i]);
                }
                dir = 3;
                bottom--;
                
            }else{
                for(int i = bottom; i>= top; i--){
                    
                    ans.add(matrix[i][left]);
                }
                dir = 0;
                left++;
                
            }
            
            
            
            
            
        }
        
        
        return ans;
        
    }
}