class Solution {
    
    public int find(int nums[] , int target , int i){
        
        int start = 0;
        int end = nums.length - 1;
        int count = -1;
        
        while(start <= end){
            int mid = (start + end)/2;
            
            if(nums[mid] == target){
                count = mid;
                if(i == 0){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }else{
                
                if(nums[mid] > target){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
                
                
            }
            
            
        }
        
        return count;
        
    }
    
    
    
    
    
    
    
    
    public int[] searchRange(int[] nums, int target) {
        
        int arr[]= {-1 , -1};
        
        arr[0] = find(nums , target , 0);
        arr[1] = find(nums , target , 1);
        return arr;
        
    }
}