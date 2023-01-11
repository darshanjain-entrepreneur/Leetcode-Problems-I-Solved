class Solution {
    
    public boolean find(int nums[] , int i ,int  target , int dp[][]){
        if(target == 0){
            return true;
        }
        if(i == 0){
            return nums[i] == target;
        }
        
        if(dp[i][target] != -1){
            if(dp[i][target] == 1){
                return true;
            }else{
                return false;
            }
            
        }
        
        
        
        boolean nottake = find(nums ,i - 1 , target , dp);
        boolean take = false;
        if(target >= nums[i]){
            
            take = find(nums , i - 1 , target - nums[i] , dp);
        }
        if(take || nottake == true){
            dp[i][target] = 1;
            
        }else{
            dp[i][target] = 0;
        }
        
        return take || nottake;
        
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
                int dp[][] = new int[nums.length][(sum/2) + 1];
            
            for(int rows[] : dp){
                Arrays.fill(rows , -1);
            }
            
            return find(nums , nums.length - 1 , sum / 2 , dp);
        }
        
        
        
    }
}