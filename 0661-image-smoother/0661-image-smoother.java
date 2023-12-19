class Solution {
    public int[][] imageSmoother(int[][] img) {
        
        int n = img.length;
        
        int m = img[0].length;
        
        int temp[] = new int[m];
        
        int prevcorner = 0;
        
        for(int i = 0; i < n; i++){
            
            
            for(int j = 0; j < m; j++){
                
                
                int sum = 0;
            int count = 0;
                
                if(i+1 < n){
                    
                    if(j -1 >= 0){
                        sum = sum + img[i+1][j-1];count++;
                    }
                    
                    sum = sum + img[i+1][j];
                    count++;
                    
                    if(j+1 < m){
                        
                        sum = sum + img[i+1][j+1];
                        count++;
                    }
                    
                    
                }
                
                
                if(j+1 < m){
                    sum  =sum + img[i][j+1];
                    count++;
                }
                
                sum = sum + img[i][j];
                count++;
                
                if(j-1 >= 0){
                    sum = sum + temp[j-1];
                    count++;
                }
                
                if(i-1 >= 0){
                    
                    
                    if(j-1 >= 0){
                        
                        sum = sum + prevcorner;
                        count++;
                    }
                    
                    sum = sum + temp[j];
                    count++;
                    
                    if(j+1 < m){
                        sum = sum + temp[j+1];
                        count++;
                    }
                    
                }
                
              if(i-1 >= 0){
                    prevcorner = temp[j];
              }
                temp[j] = img[i][j];
                
                img[i][j] = sum/count;
                
                
            }
        }
        
        return img;
    }
}