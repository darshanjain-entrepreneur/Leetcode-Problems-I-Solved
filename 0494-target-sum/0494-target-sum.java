class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        
        if(nums.length == 1){
            if(nums[0] == target || nums[0] == -target){
                return 1;
            }else{
                return 0;
            }
        }
        
        
       return find(nums.length-1 , target , nums); 
        
        
        
        
        
        
    }
    
    public int find(int i , int target ,int nums[] ){
        
       if(i == 0){
           
       if(target == 0 && nums[0] == 0){
           
           return 2;
       }else if(target == 0){
           return 0;
       }else if(target - nums[i] == 0 || target + nums[i] == 0){
           return 1;
       }
           
          return 0; 
       }
        
        
        int positive = find(i-1 , target+nums[i] , nums);
        int negative = find(i-1 , target-nums[i] , nums);
        
        return positive+negative;
      
        
        
  
        
        
    }
}