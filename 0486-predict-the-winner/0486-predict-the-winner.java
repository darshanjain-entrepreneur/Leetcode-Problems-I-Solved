class Solution {
    
    
    public int findsum(int i , int j , int nums[]){
        
        if(i > j){
            return 0;
        }
        if(i == j){
            return nums[i];
        }
        
        int take = nums[i] + Math.min(findsum(i+2 ,j , nums ) , findsum(i+1 , j-1 , nums));
        
         int nottake = nums[j] + Math.min(findsum(i ,j -2, nums ) , findsum(i+1 , j-1 , nums));
        
        
       return Math.max(take , nottake); 
        
    }
    
    
    
    
    public boolean PredictTheWinner(int[] nums) {
        
        
        int totalscore = 0;
        
        for(int i : nums){
            totalscore = totalscore+i;
        }
        
        
       int firstPlayerSum = findsum(0 , nums.length-1 , nums); 
        
        int secondPlayerSum = totalscore-firstPlayerSum;
        
        
        
        return firstPlayerSum >= secondPlayerSum;
        
        
    }
}