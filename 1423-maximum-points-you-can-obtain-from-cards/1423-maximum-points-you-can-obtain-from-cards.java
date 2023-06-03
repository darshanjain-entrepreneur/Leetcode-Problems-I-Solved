class Solution {
    public int maxScore(int[] nums, int k) {
        
        int n = nums.length;
        int max = 0;
    
        
        int sum = 0;
        for(int i = 0; i < k; i++){
            
            sum+= nums[i];
            
            
            
        }
        max = sum;
        
     int j = n-1;
        int start = k-1;
        
        while(start >= 0 && j >= start){
            
            
            sum  = sum - nums[start] + nums[j];
            max = Math.max(max , sum);
            start--;
            j--;
            
            
        }
        return max;
    }
}