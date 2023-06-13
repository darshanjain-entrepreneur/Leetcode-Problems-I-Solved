class Solution {
    public int maximizeSum(int[] nums, int k) {
        
        
        Arrays.sort(nums);
        
        int sum = 0;
        
        for(int i = 0; i < k; i++){
            
            sum = sum + nums[nums.length - 1];
            int a = nums[nums.length - 1];
            a = a + 1;
            nums[nums.length - 1] = a;
            
        }
        
        
        return sum;
    }
}