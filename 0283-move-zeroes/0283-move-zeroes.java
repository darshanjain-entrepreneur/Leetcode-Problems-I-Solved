class Solution {
    public void moveZeroes(int[] nums) {
        
     int k = 0;
        
        for(int i = 0; i < nums.length; i++){
            
            if(nums[i] != 0){
                
                if(nums[k] == 0){
                    nums[k] = nums[i];
                    nums[i] = 0;
                    k++;
                }else{
                    k++;
                }
                
            }
            
            
            
        }
        
    }
}