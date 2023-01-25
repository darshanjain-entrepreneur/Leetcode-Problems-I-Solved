class Solution {
    
    
    public int binarysearch(int nums[] , int target , int start , int end){
        
        while(start <= end){
            int mid = start + (end - start)/2;
            if(nums[mid] == target){
                return mid;
            }else{
                if(nums[mid] > target){
                    end = mid - 1;
                    
                }else{
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
    
    public int findpivot(int nums[] , int target){
        
        int start = 0;
        int end = nums.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(mid + 1 <= nums.length - 1 && nums[mid] > nums[mid + 1]){
                return mid;
            }
            if(mid - 1 >= 0 && nums[mid] < nums[mid - 1]){
                return mid - 1;
            }
            
            if(nums[mid] <= nums[start]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
            
            
        }
        
        
        
        
    
    
    
    
    
    return -1;
    
    
    
    }
    
    
    
    public int search(int[] nums, int target) {
 
            // here we will use it to find pivot index
            int pivotindex = findpivot(nums , target );
            
        if(pivotindex == -1){
            
            return binarysearch(nums , target , 0 , nums.length - 1);
        }else{
            
            if(nums[pivotindex] == target){
                return pivotindex;
            }
        
            int ans1 = binarysearch(nums ,target , 0 , pivotindex - 1 );
            if(ans1 != -1){
                return ans1;
            }else{
                return  binarysearch(nums , target , pivotindex + 1  , nums.length - 1);
            }
           
            
            
        }
        
        
        
        
        
    
    
    
    
    
    
    }   
}