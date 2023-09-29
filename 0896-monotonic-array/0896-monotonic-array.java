class Solution {
    public boolean isMonotonic(int[] nums) {
               if(nums.length == 1){
            return true;
        }
      int start = 0;
        int count = 0;
        
 for(int i = 0; i < nums.length-1; i++){
     
     if(nums[i] == nums[i+1]){
         
         
         
     }else{
         
         if(start == 0 ){
             
             if(nums[i] > nums[i+1]){
                 count = 1;
             }else{
                 
                 count = 0;
             }
             
             
             
         }else if(start == 1){
             
             if(nums[i] > nums[i+1] && count == 0){
                 return false;
             }else if(nums[i] < nums[i+1] && count == 1){
                 return false;
             }
             
         }
         
         
         
         
         start = 1;
     }
     
     
     
     
     
 }
        
        
        return true;
    }
}