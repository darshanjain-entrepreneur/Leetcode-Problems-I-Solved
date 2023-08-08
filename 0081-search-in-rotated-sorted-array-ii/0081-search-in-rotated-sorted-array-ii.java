class Solution {
    public boolean search(int[] nums, int target) {
        
        int n = nums.length;
        
        if(n == 1){
            
            return nums[0] == target ? true : false;
        }
        
        int start = 0;
        int end = nums.length-1;
        
        while(start <= end){
            
            int mid = (end-start)/2 + start;
            
            if(nums[mid] == target){
                return true;
            }
           if(nums[start] == nums[mid] && nums[mid] == nums[end]){
               
               start++;
               end--;
               continue;
               
               
           } 
            
            if(nums[start] <= nums[mid]){
                
                if(nums[start] <= target && target <= nums[mid]){
                    
                    end = mid-1;
                }else{
                    
                    start = mid+1;
                }
                
                
            }else{
                
                if(nums[mid] <= target && target <= nums[end]){
                    
                    start = mid+1;
                    
                }else{
                    
                    end = mid-1;
                }
                
                
                
                
            }
            
            
            
        }
        
        
        
        return false;
        
    }
}