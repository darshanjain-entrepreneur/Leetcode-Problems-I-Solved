class Solution {
    public int partitionArray(int[] nums, int k) {
        
        Arrays.sort(nums);
        
        
       int start = 0;
        int end = 0;
        int count = 0;
        
       while(start <= end && end < nums.length){
           
           if(nums[end] - nums[start] <= k){
               
               if(end == nums.length-1){
                   count++;
               }
               
             end++;     
           }else{
               
               start = end;
               count++;
               
               
               
           }
           
           
           
           
       }
        
        
        
        return count;
        
        
    }
}