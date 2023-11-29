public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        
        
        if(n == 0){
            return 0;
        }
        int count = 0;
        
        if(n < 0){
            
            
            
         
            count = 1;
            
        }
        
        
        for(int i = 0; i <=30; i++){
            
            
            if(((n>>i) & 1) ==  1 ){
                
                count++;
            }
            
            
        }
        
        
        return count;
        
    }
}