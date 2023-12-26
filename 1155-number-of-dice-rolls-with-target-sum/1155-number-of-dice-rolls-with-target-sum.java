class Solution {
       int mod = (int)(1e9)+7;
    public int numRollsToTarget(int n, int k, int target) {
        
        long dp[][] = new long[n+1][1001];
        for(long row[] : dp){
            Arrays.fill(row , -1);
        }
     
        return (int)(solve(0 , n , target , k , dp)%mod);
    }
    
    public long solve(int i , int n , int target , int k , long dp[][]){
        
     if(i == n){
         
         if(target == 0){
             return 1;
         }
         return 0;
     }
        
        if(dp[i][target] != -1){
            
            return dp[i][target];
        }
        
        long ans = 0;
        
        for(int j = 1; j<=k; j++){
            
            
            if(j <= target){
                
                ans = (ans + solve(i+1 , n , target - j , k , dp))%mod;
            }
            
            
            
            
        }
        
        
        
        return  dp[i][target] =  ans;
        
        
    }
}