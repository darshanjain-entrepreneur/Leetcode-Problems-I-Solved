class Solution {
    public boolean isPowerOfTwo(int n) {
        
        if(n == 0){
            return false;
        }
        
        if(n ==1){
            return true;
        }
        
        if(n% 2 != 0){
            
            return false;
        }
        
        
        while(n!= 0){
            
            
            n = (int)n/(int)2;
            
            if(n% 2!= 0 && n!= 1){
                
                return false;
            }
            
            
            
            
            
        }
        
        
        return true;
        
        
    }
}