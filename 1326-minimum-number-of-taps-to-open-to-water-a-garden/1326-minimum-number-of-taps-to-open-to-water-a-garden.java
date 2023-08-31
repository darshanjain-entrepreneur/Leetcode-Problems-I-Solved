class Solution {
    public int minTaps(int n, int[] ranges) {
        
    int max = 0;
        int min = 0;
        int tap = 0;
        
        while(max < n){
            
            for(int i = 0; i < ranges.length; i++){
                
                
                if(min >= (i-ranges[i]) && (i+ranges[i]) > max ){
                    
                    max = i+ranges[i];
                    
                }
            }
            
            if(min == max){
                return -1;
            }
            min = max;
            tap++;
            
        }
        
        
        
        return tap;
    }
}