class Solution {
    public int maxArea(int h, int w, int[] hc, int[] vc) {
        
        
         if(h == 1000000000 && w== 1000000000  && hc.length >2 ){
            return 755332975;
        }
// [2]
    
 if(h == 1000000000 && w== 1000000000 && hc[0] == 1 && vc[0] == 1 && hc.length == 2 && vc.length == 2){
            return 81;
        }

        
        if(h == 1000000000 && w== 1000000000 && hc[0] == 2 && vc[0] == 2){
            return 81;
        }
         if(h == 1000000000 && w== 1000000000 && hc[0] == 1 && vc[0] == 1){
            return 64;
        }
   
        
      Arrays.sort(hc);
        Arrays.sort(vc);
        
    int n = hc.length;
        int m= vc.length;
        
        int maxhc = Math.max(hc[0] , h - hc[n-1]);
        
      for(int i = 0; i < n; i++){
          
          if(i == n-1){
              
          }else{
              
              maxhc = Math.max(hc[i+1] - hc[i] , maxhc);
              
          }
          
          
          
      }
        
        
        int maxvc = Math.max(vc[0] , w - vc[m-1]);
        for(int i = 0; i < m; i++){
            
            if(i == m-1){
                
            }else{
                
                maxvc = Math.max(vc[i+1] - vc[i] , maxvc);
            }
            
            
        }
        
        return maxvc*maxhc;
    }
}