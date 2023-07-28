class Solution {
    public int longestOnes(int[] nums, int k) {
        
     int i =0;
        int j = 0;
        int result = 0;
        int zerocount = 0;
        
        
        while(i <= j && j < nums.length && i < nums.length){
            
            if(nums[j] == 0){
                zerocount++;
            }
            
            while(zerocount > k && i<=j){
                
                if(nums[i] == 0){
                    zerocount--;
                }
                i++;
            }
            
            result = Math.max(result ,j-i+1);
            j++;
            
        }
        
        
        return result;
    }
}