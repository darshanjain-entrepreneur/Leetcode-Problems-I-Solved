class Solution {
    public int threeSumClosest(int[] nums, int target) {
        
        
       
        Arrays.sort(nums);
        int min = (int)1e9;
        int absmin = (int)1e9;
        
        
        
        for(int i = 0; i < nums.length; i++){
        
            
            int j = i + 1;
            int k = nums.length - 1;
            
            
            while(j < k){
                
                int sum1 = nums[i] + nums[j] + nums[k];
                
              int sum = nums[i] + nums[j] + nums[k] - target;
           
                if(sum == 0){
                    return nums[i] + nums[j] + nums[k];
                }
                
              if(absmin > Math.abs(sum1 - target)){
                  
                  absmin = Math.abs(sum1 - target);
                  min = sum1;
              }
                
                if(sum > 0){
                    k--;
                }else if(sum < 0){
                    j++;
                }
        
            
                
                
            }
            
            
            
        }
        
 
        
    
        return min;
        
        
        
        
    }
}