class Solution {
    public int minPairSum(int[] nums) {
        
        Arrays.sort(nums);
        
        int max = -(int)1e9;
        
        
        int start = 0;
        int end = nums.length-1;
        
        while(start < end){
            
            max = Math.max(max , nums[start] + nums[end]);
            start++;
            end--;
            
            
            
        }
        
        
        
        return max;
        
        
    }
}