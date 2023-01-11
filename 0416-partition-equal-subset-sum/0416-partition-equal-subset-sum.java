class Solution {
    
 public boolean find(int nums[] , int target){
     
     boolean dp[][] = new boolean[nums.length][target + 1];
     
     for(int i = 0 ; i < nums.length; i++){
         
         dp[i][0] = true;
     }
     
if(nums[0] <= target){
    dp[0][nums[0]] = true;
}
     
     
     for(int i = 1 ; i < nums.length; i++){
         
         for(int j = 1; j < target + 1; j++){
             
             boolean nottake = dp[i-1][j];
             boolean take = false;
             if(nums[i] <= j){
                 take = dp[i-1][j - nums[i]];
             }
             dp[i][j] = take || nottake;
             
         }
     }
     return dp[nums.length - 1][target];
 }
    
    
    
public boolean canPartition(int[] nums) {
         
        if(nums.length == 0){
            return true;
        }
        int sum = 0;
        
        for(int i = 0; i < nums.length; i++){
            
            sum = sum + nums[i];
        }
        
        
        if(sum % 2 != 0){
            return false;
        }else{
               
            int target = sum /2;
            
            return find(nums , target);
            
            
            
        }
        
        
        
    }
}