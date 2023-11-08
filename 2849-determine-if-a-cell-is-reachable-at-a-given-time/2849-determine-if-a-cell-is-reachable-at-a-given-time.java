class Solution {
    public boolean isReachableAtTime(int sx, int sy, int fx, int fy, int t) {
          int maxi = Math.abs(fx -sx) + Math.abs(fy - sy);
        
        if(sx == fx && sy == fy){
            
           if(t == 1){
               return false;
           }else{
               return true;
           }
        }
        
        
        int min = Math.min(Math.abs(fx - sx) , Math.abs(fy - sy));
        
        
              if(sy >= fy){
                  sy = sy - min;
              }else{
                  
                  sy = sy + min;
              }
        
        
        if(sx >= fx){
            
            sx = sx - min;
        }else{
            sx = sx + min;
        }
        
        
        int mini = min;
        mini = mini + Math.abs(fx -sx) + Math.abs(fy - sy);
        
     if(mini > t){
         return false;
     }
        
      
        
        return true;
    }
}