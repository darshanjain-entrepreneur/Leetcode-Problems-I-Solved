class Solution {
    public int firstMissingPositive(int[] nums) {
        
        
          int n = nums.length;
        
        int i = 0;
        while(i < n){
            
           if(nums[i] >= 1 && nums[i] <= n){
               
                int curr = nums[i] - 1;
            
            if(nums[curr] != nums[i]){
                
                int temp = nums[i];
                nums[i] = nums[curr];
                nums[curr] = temp;
            }else{
                
                i++;
            }
               
               
           }else{
               i++;
           }
            
            
            
        }
        
        
        
        for(int k = 0; k < n; k++){
            
            if(nums[k] != k + 1){
                return k +1;
            }
            
            
            
        }
        
        
        return n+1;
    }
}