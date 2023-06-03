class Solution {
    
   
    public static int jump(int[] nums) {
        
        int n = nums.length;
        int dp[] = new int[n+1];
        
        Arrays.fill(dp , -1);
        
       return   find( nums[0] , 0 , nums , n , dp);

        
    }
    
    public static  int find( int val , int i , int nums[] , int n , int dp[]){
      
        if(i == n-1){
            
            return 0;
        }
        if(dp[i] != -1){
            return dp[i];
        }
        
        
        int min = (int)1e9;
        
        for(int j = 1; j <= val; j++){
            
            if(j + i < n){
                
                min = Math.min(min , 1 + find(nums[i+j] , i + j , nums , n , dp));
                
               
            }
            
            
        }
       return   dp[i]  = min;
        
    }
}