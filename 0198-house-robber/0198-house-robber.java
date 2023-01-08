class Solution {
    public int rob(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        
        
        
        int n = nums.length;
        int ans = 0;
        int prev = nums[0];
        int temp = 0;
        
        for(int i = 1; i < n; i++){
            
            int notpick = prev;
            int pick = nums[i];
            if(i > 1){
                pick = pick + temp;
            }
            
            ans = Math.max(pick , notpick);
            temp = prev;
            prev = ans;
            
            
        }
        
        return prev;
        
        
    }
}