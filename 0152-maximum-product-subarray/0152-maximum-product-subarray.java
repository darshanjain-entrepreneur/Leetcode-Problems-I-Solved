class Solution {
    public int maxProduct(int[] nums) {
        
        
        int max = (int)-1e9;
        int prefix = 1;
        int suffix = 1;
        int count = 0;
        
        for(int i = 0; i < nums.length; i++){
            
            if(nums[i] == 0){
                
                count = 1;
                prefix = 1;
                
                
                
                
            }else{
                
                
                
               prefix = prefix*nums[i];
                
                  max = Math.max(prefix , max);
                
                
                
                
            }
            
            
          
            
            
            
        }
        
        
        // suffix
        
          for(int i = nums.length-1; i>=0; i--){
            
            if(nums[i] == 0){
                
                count = 1;
                suffix = 1;
                
                
                
                
            }else{
                
                
                suffix = suffix*nums[i];
                
                
                  max = Math.max(max , suffix);
                
                
                
                
            }
            
            
            
          
            
            
        }
        
        
        if(max < 0 &&  count == 1){
            
            max = 0;
        }
        
        return max;
    }
}