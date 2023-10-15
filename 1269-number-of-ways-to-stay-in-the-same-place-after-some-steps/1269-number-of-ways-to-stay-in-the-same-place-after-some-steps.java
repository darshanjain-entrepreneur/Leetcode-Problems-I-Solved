class Solution {
    
    
    int Mod = (int)(1e9) + 7;
    

    public int numWays(int steps, int arrLen) {
        
               int maxPos = Math.min(steps,arrLen);
        
        int dp[][] = new int[maxPos+1][steps+1];
        
        for(int row[]: dp){
            
         Arrays.fill(row , -1);
        }
        
      return (int)(solve(0 , steps , arrLen ,  dp))%Mod;
        
        
    }
    
    public long solve(int i , int steps , int a, int dp[][]){
        
        
        if(i < 0 || i >= a){
            return 0;
        }
        
if(steps == 0){
    
    if(i == 0){
      
        return 1;
    }
    
    return 0;
}
      
        if(dp[i][steps] != -1){
            
            return (dp[i][steps])%Mod;
        }
        
     long aa =   (solve(i+1 , steps-1 , a , dp ))%Mod;
        
     long b =   (solve(i , steps-1 , a , dp ))%Mod;
        
    long c =   (solve(i-1 , steps-1 , a , dp))%Mod;
        
      
     
        
   return  dp[i][steps] =  (int)((aa+b+c)%Mod);     
        
    }
}