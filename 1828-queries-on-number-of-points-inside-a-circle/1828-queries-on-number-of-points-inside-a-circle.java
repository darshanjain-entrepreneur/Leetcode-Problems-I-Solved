class Solution {
    
    public boolean find(int x , int y , int centrow , int centcol , int radius){
        
int b = x*x + y*y - (2*x*centrow) - (2*y*centcol) +(centrow*centrow)+(centcol*centcol) - (radius*radius);
        
        if(b <= 0){
            return true;
        }else{
            return false;
        }
        
    }
    
    
    
    
    
    public int[] countPoints(int[][] points, int[][] queries) {
        
        
        int n = queries.length;
        int m = points.length;
        int answer[] = new int[n];
        
        for(int i = 0; i < n; i++){
            
            int count = 0;
          for(int j = 0; j < m; j++){
              
              
              if(find(points[j][0] , points[j][1] , queries[i][0] , queries[i][1] ,queries[i][2]) ){
                  
                  count++;
              }
              
              
              
          }
            
            answer[i] = count;
            
        }
            
            
            
        
        
        
        return answer;
        
        
    }
}