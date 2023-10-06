class Solution {
    public int integerBreak(int n) {
        
        
        int dp[] = new int[n+1];
        Arrays.fill(dp , -1);
        
        return find(n , dp);
    }
    
    
    public int find(int n , int dp[]){
        if(n==1){
            
            return 1;
        }
        
        int a = -1;
        
        if(dp[n]!= -1){
            
            return dp[n];
        }
        
        for(int i = 1; i < n; i++){
            
            int b = i*(n-i);
            int c = i*(find(n-i , dp));
            
            a = Math.max(a , Math.max(b , c));
            
        }
        
        
      return dp[n] =  a;  
        
    }
        
}