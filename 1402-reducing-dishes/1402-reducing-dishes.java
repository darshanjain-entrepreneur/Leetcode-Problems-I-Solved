class Solution {
    public int maxSatisfaction(int[] nums) {
        
        Arrays.sort(nums);
        
        if(nums[nums.length -1] <= 0){
            return 0;
        }
        
        if(nums[0] >= 0){
            
           
            int sum = 0;
            int time = 1;
            for(int i : nums){
                
                sum = sum + time*i;
                time++;
                
            }
            
            return sum;
            
            
            
            
            
        }
        
        
       
        int start = 0;
        int max = -(int)1e9;
        while( start < nums.length){
            int time = 1;
            int sum = 0;
            for(int i =start; i < nums.length; i++ ){
                
                sum = sum + time*nums[i];
                time++;
                
            }
            
            
            max = Math.max(max , sum);
            start++;
            
        }
        
        return max;
     
    }
}