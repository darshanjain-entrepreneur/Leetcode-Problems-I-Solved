class Solution {
    public void nextPermutation(int[] nums) {
        
        if(nums.length == 1){
            return;
        }
        
        int i = nums.length - 2;
        while(i >= 0 && nums[i] >= nums[i+1])i--;
        
        if(i != -1){
            
            int j = nums.length - 1;
            while(nums[j] <= nums[i]){
                j--;
            }
            
            // swap
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            
            // reverse
            reverse(i + 1 , nums.length - 1 , nums );
            
            
        }else{
            reverse(0 , nums.length - 1 , nums);
        }
    
    }
        public void reverse(int start , int end , int nums[]){
            
            
            while(start < end){
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }
            
            
            
            
            
        }
}