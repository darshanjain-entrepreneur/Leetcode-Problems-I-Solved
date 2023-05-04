class Solution {
    public int[] runningSum(int[] nums) {
        int n = nums.length;
        
        int ans[] = new int[n];
        
        for(int i = 0; i < nums.length; i++){
            
            if(i -1 >= 0){
                
                ans[i] = ans[i-1] + nums[i];
            }else{
                
                ans[i] = nums[i];
            }
            
            
            
        }
        return ans;
        
    }
}