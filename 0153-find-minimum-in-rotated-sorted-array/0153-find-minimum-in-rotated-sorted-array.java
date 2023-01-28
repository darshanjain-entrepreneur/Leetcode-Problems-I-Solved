class Solution {
    
    
    public int findpivot(int nums[]){
        
        int start = 0;
        int end = nums.length - 1;
        while(start <= end){
            
            int mid = start + (end - start)/2;
            
            if( mid + 1 < nums.length && nums[mid] > nums[mid + 1]){
                
                return mid;
                
                
            }
            
            if(mid - 1 >= 0 && nums[mid] < nums[mid - 1]){
                return mid - 1;
            }
            
            if(nums[start] >= nums[mid]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
            
        }
        
        
        
        return -1;
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    public int findMin(int[] nums) {
        int n = nums.length;
        if(n == 1){
            return nums[0];
        }
        
        int pivotindex = findpivot(nums);
        
        
        if(pivotindex == -1){
            return nums[0];
        }else{
            
           return nums[pivotindex + 1]; 
            
            
        }
        
        
        
        
        
        
        
    }
}