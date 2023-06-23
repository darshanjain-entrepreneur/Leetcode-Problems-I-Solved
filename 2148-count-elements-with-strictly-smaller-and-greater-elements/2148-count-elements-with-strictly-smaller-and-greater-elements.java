class Solution {
    public int countElements(int[] nums) {
        
      int min = (int)1e9;
        int max = (int)-1e9;
       
        
        for(int i = 0; i <= nums.length-1; i++){
            
           min = Math.min(nums[i] , min);
            
            max = Math.max(nums[i] , max);
            
            
            
            
            
        }
     
         
        int count =0;
        
         for(int i = 0; i <= nums.length-1; i++){
            
       
            if(nums[i] > min && nums[i] < max){
                
                count++;
            }
            
            
            
            
        }
     
        
        return count;
        
    }
}