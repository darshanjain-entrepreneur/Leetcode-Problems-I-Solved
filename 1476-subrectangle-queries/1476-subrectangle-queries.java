class SubrectangleQueries {
int nums[][];
    public SubrectangleQueries(int[][] rectangle) {
        
     nums = rectangle;
    }
    
    public void updateSubrectangle(int row1, int col1, int row2, int col2, int newValue) {
        
     for(int i = row1; i <= row2; i++){
         
         for(int j = col1; j <=col2; j++){
             
             nums[i][j] = newValue;
             
         }
         
     }   
        
        
        
        
        
    }
    
    public int getValue(int row, int col) {
        
        if(row < nums.length && row >= 0 && col < nums[0].length && col >=0){
            return nums[row][col];
            
        }else{
            
            return -1;
        }
    }
}

