class Solution {
    public int findValueOfPartition(int[] nums) {
        
        Arrays.sort(nums);
        
        int min = (int)(1e9);
        int start = 0;
        int end = 1;
        
        
        while(start < nums.length-1 && end < nums.length){
            
            
            min = Math.min(min , Math.abs(nums[end] - nums[start]));
            
            start++;
            end++;
            
        }

        
        
     return min;
        
    }
}