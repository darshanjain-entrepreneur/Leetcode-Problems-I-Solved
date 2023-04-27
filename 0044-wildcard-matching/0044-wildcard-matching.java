class Solution {
    public boolean isMatch(String s, String p) {
        
    
        int n = p.length();
        int m = s.length();
        
        Boolean dp[][] = new Boolean[n+1][m+1];
        
        return find(n , m , p , s ,dp );
       
        
    }
    
    public boolean find(int i , int j , String p , String s , Boolean dp[][]){
        
      if( i== 0 && j == 0){
          return true;
      }
        if(i == 0){
            return false;
        }
        if(j == 0){
            
            for(int k = 1; k <= i; k++){
                
                if(p.charAt(k-1) != '*'){
                    return false;
                }
            }
            return true;
        }
        
        
        
        if(dp[i][j] != null){
            return dp[i][j];
        }
        
        
        if(p.charAt(i-1) == s.charAt(j-1) || p.charAt(i-1) == '?'){
            return dp[i][j] = find(i-1 , j-1 , p , s  , dp);
        }
      
        if(p.charAt(i-1) == '*'){
            
            return dp[i][j] = find(i , j-1 , p , s , dp) || find(i-1 ,j , p , s, dp);
        }
        
        
        
        
        return dp[i][j] = false;
        
        
    }
}