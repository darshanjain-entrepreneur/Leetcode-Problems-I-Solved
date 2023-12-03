class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        
        int count = 0;
        
        
        for(int i = 0; i < points.length-1; i++){
            
            
            int x1 = points[i][0];
            int y1 = points[i][1];
            
            int x2 = points[i+1][0];
            int y2 = points[i+1][1];
            
            
            if(x1 == x2 && y1 == y2){
                continue;
            }
            
            
         if(y2 >= y1 && x2 >= x1){
               while(y2 > y1 && x2 > x1){
               
               count++;
               x1++;
               y1++;
               
           }
            
           
             
             count = count + Math.abs(x2 - x1) + Math.abs(y2-y1);
             continue;
             
         }
            
            
            
            if(x2  <= x1 && y2 <= y1){
                
                while(x1 > x2 && y2 < y1){
                    
                    y1--;
                    x1--;
                    count++;
                }
                
                count = count + Math.abs(x2-x1) + Math.abs(y2 - y1);
                continue;
            }
            
            
            if(x2 >= x1 && y2 <= y1){
                
                
                while(x2 > x1 && y2 < y1){
                    
                    x1++;
                    y1--;
                    count++;
                }
                
                
                  count = count + Math.abs(x2-x1) + Math.abs(y2 - y1);
                continue;
                
            }
            
            
            
           if(x2 <= x1 && y2 >= y1){
                
                
                while(x2 < x1 && y2 > y1){
                    
                    x1--;
                    y1++;
                    count++;
                }
                
                
                  count = count + Math.abs(x2-x1) + Math.abs(y2 - y1);
                continue;
                
            }  
            
            
            
            
        }
        
        
        return count;
        
    }
}