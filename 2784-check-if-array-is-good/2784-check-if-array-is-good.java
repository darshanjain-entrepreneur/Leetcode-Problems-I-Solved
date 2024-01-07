class Solution {
    public boolean isGood(int[] nums) {
        
        
        int n = nums.length-1;
        
        
        
        int arr[] = new int[nums.length];
        
        for(int i = 0; i < nums.length; i++){
            
            
            if(nums[i] < 1 || nums[i] > n){
                
                return false;
            }
            
            arr[nums[i]]++;
            
        }
        
        if(arr[arr.length-1] != 2){
            
            return false;
        }
        
        for(int i = 1; i < arr.length-1; i++){
            
            if(arr[i] != 1){
                
                return false;
            }
        }
        
        
        
        return true;
        
      
        
    }
}