class Solution {
    public int minDifficulty(int[] job, int d) {
        
        int n = job.length;
        if(n < d){
            
          return -1;  
            
            
        }
        
        int dp[][][] = new int[301][14][1003];
        
        for(int row[][] : dp){
            
            for(int col[] : row){
                Arrays.fill(col , -1);
            }
        }
       
        return solve(0 , job , d , job.length , 1002 , 1 , dp);
        
        
        
    }
    
    
    public int solve(int i , int[] job , int d , int n , int max , int j , int dp[][][]){
        
        if(j > d){
            
            
           if(i >= n){
               
               return 0;
           }else{
               
               return (int)(1e9);
           }
            
            
        }
        
        if(i >= n){
            
            return (int)(1e9);
        }
        
        
        if(dp[i][j][max] != -1){
            
            return dp[i][j][max];
        }
     
    
        int ans1 = (int)(1e9);
      
        
        
        if(max == 1002){
            
            ans1 = solve(i+1 , job , d , n , job[i] , j , dp);
            
        }
        
      int max1 = Math.max(max , job[i]);
    if(max == 1002){
        
        max1 = job[i];
    }
       int  ans2 = max1 + solve(i+1 , job , d , n , 1002 , j+1 , dp);
        
        int ans3 = solve(i+1 , job , d , n , max1 , j , dp);
        
        return dp[i][j][max] =  Math.min(ans1  ,Math.min(ans2 , ans3));
        
        
    }
}