class Solution {
    public int minNumberOperations(int[] target) {
        
        if(target.length == 0){
            return 0;
        }
        
        if(target.length == 1){
            return target[0];
        }
        
        int ans = 0;
        int max = 0;
        
        for(int i = 0 ; i < target.length; i++){
            
            
            
         
          
            if(i < target.length - 1 && target[i] > target[i+1]){
                
                
                ans = ans + target[i] - target[i+1];
                max = target[i+1];
                
            }else{
                
                
                max = Math.max(max , target[i]);
                
            }
            
            
            
        }
        return ans+max;
    }
}