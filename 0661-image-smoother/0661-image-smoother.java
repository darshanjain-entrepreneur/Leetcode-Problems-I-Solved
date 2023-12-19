class Solution {
    public int[][] imageSmoother(int[][] img) {
        
        
        int n = img.length;
        
        int m = img[0].length;
        
        
        int arr[][] = {
            
            {-1 , -1}, {-1 , 0} , {-1 , 1} , {0,0} , {0 , -1} , {0 , 1} , {1 , -1},
            {1 , 0} , {1 , 1}
            
            
        };
        int ans[][] = new int[n][m];
        
        for(int i = 0; i < n; i++){
            
            
            for(int j = 0; j < m; j++){
                int sum = 0;
                int count = 0;
              
                for(int temp[] : arr){
                    
                    
                    int row = temp[0]+i;
                    int col = temp[1]+j;
                    
                    if(row >= 0 && row  < n && col >= 0 && col < m){
                        
                        sum = sum + img[row][col];
                        count++;
                    }
                    
                }
                
                ans[i][j] = sum/count;
                
            }
        }
        
        
        return ans;
    }
}