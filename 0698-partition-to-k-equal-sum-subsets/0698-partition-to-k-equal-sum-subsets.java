class Solution {
    public boolean canPartitionKSubsets(int[] nums, int k) {
        
    int n = nums.length;
        
        if(k > n){
            
            return false;
        }
        
        
        if(k == 1){
            return true;
        }
        
        
        int sum = 0;
        for(int i = 0; i < n; i++){
            
            sum+=nums[i];
        }
        
        if(sum %k != 0){
            return false;
        }
        
        sum = sum/k;
        
        boolean vis[] = new boolean[n];
        
        
        return solve(0 ,0 , nums , sum , k , vis );
        
        
    }
    
    public boolean solve(int start , int cursum , int nums[] , int target , int k , boolean vis[]){
        
        
        if(k == 1){
            return true;
        }
        
        if(cursum > target){
            return false;
        }
        
        if(cursum == target){
            
           return solve(0 , 0 , nums , target , k-1 , vis); 
            
            
            
        }
        
        
           for(int i = start; i < nums.length; i++){
               
               if(vis[i]){
                   continue;
               }
               
               vis[i] = true;
               if(solve(i + 1 , cursum + nums[i] , nums , target , k , vis )){
                   return true;
               }
               vis[i] = false;
           }
        
           
           return false;
    }
    
}