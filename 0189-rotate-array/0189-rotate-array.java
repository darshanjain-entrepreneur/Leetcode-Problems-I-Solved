class Solution {
    public void rotate(int[] nums, int k) {
        
       int n = nums.length;
        if(n == 0 || k == 0){
            return;
        }
        
        k = k%n;
        
        int start = 0;
        int end = nums.length-1;
        
        while(start < end){
            
            int temp = nums[start];
           nums[start] = nums[end];
            nums[end] = temp;
            
            start++;
            end--;
        }
        
        
        start = 0;
        end = k-1;
        while(start < end && end < nums.length && start < nums.length){
           int temp = nums[start];
           nums[start] = nums[end];
            nums[end] = temp;
            
            start++;
            end--;  
            
        }
        
        start = k;
        end = n-1;
        
        while(start < end && end < nums.length && start < nums.length){
            int temp = nums[start];
           nums[start] = nums[end];
            nums[end] = temp;
            
            start++;
            end--;  
            
        }
        
        
        
    }
}