class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        
    int i = 0;
        
        while(i < n){
            
            int currindex =nums[i] -1;
            
            if(nums[currindex] != nums[i]){
                
                int temp = nums[currindex];
                nums[currindex] = nums[i];
                
                nums[i] = temp;
                
                
                
                
                
            }else if(i != currindex){
                return nums[i];
            }else{
                i++;
            }
            
            
            
        }
        
        
        
        return -1;
        
        
        
    }
}