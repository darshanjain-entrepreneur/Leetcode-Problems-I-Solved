class Solution {
    public int[] twoSum(int[] nums, int target) {
        
 int ans[] = new int[2];
        for(int i = 0; i < nums.length; i++){
            
            int t = target-nums[i];
            int count = 0;
            int start = 0;
            int end = nums.length-1;
            
         if(t < nums[i]){
             
             start = 0;
             end = i-1;
             
             while(start <= end){
                 
                int mid = start + (end-start)/2;
                 
                 if(nums[mid] == t){
                     ans[0] = mid+1;
                     ans[1] = i+1;
                     count =1;
                     break;
                 }else if(nums[mid] < t){
                     
                    start = mid+1;
                     
                     
                 }else{
                     
                     end = mid-1;
                 }
                 
                 
                 
             }
             
             
             
         }else if(t == nums[i]){
             
             if(i+1 < nums.length && nums[i+1] == t){
                 
                 ans[0] = i+1;
                 ans[1] = i+2;
                 count = 1;
                
             }else if(i-1 >= 0 && nums[i-1] == t){
                  ans[0] = i-1+1;
                 ans[1] = i+1;
                 count = 1;
             }
             
             
         }else{
             
             start = i+1;
             end= nums.length-1;
                while(start <= end){
                 
                int mid = start + (end-start)/2;
                 
                 if(nums[mid] == t){
                     ans[0] = i+1;
                     ans[1] = mid+1;
                     count =1;
                     break;
                 }else if(nums[mid] < t){
                     
                    start = mid+1;
                     
                     
                 }else{
                     
                     end = mid-1;
                 }
                 
                 
                 
             }
             
             
             
         }
            
            
            if(count == 1){
                break;
            }
            
            
        }
        
        
        return ans;
        
        
    }
}