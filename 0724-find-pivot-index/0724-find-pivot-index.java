class Solution {
    public int pivotIndex(int[] nums) {
      int n = nums.length;
        int sum = 0;
        for(int i = 0; i < n; i++){
            
            sum = sum + nums[i];
        }
        
      int left = 0;
        
        
        for(int i = 0; i < n; i++){
            
            int target = sum - nums[i];
            
            if(left == target - left){
                
                return i;
            }else{
                
                left = left + nums[i];
            }
            
            
            
        }
        
        return -1;
    }
}