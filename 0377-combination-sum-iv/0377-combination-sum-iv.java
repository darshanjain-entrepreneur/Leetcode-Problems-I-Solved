class Solution {
    public int combinationSum4(int[] nums, int target) {
         
    
        int dp[][] = new int[nums.length+1][target+1];
        
        for(int row[] : dp){
            
            Arrays.fill(row ,-1);
        }
        
    return   find(0 , target , nums , dp);
    
        
       
        
   
    }
   
    
    public int  find(int index , int target , int nums[] , int dp[][] ){
     
        if(index == nums.length){
            
            if(target == 0){
                
                
             
                return 1;
                
            }
            
            return 0;
            
        } 
        
        if(dp[index][target]  != -1){
            
            return dp[index][target];
        }
        
  int take = 0;
      
        if(nums[index] <= target){
            
            
       
            
         take =    find(0 , target - nums[index] , nums , dp);
            
           
            
            
        }
    
        
      int  nottake =  find(index+1 , target , nums, dp);
        
        return dp[index][target] =  nottake + take;
        
    }
}