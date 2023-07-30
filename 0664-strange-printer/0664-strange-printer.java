class Solution {
    
    
    public int find(int i , int j , String s , int dp[][]){
        
      if(i == j){
          return 1;
      }  
        
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        
        int min = (int)(1e9);
        
        for(int k = i; k < j; k++){
            
            min = Math.min(min , find(i , k , s , dp) + find(k+1 , j , s , dp));
        }
        
        if(s.charAt(i) == s.charAt(j)){
            return dp[i][j] =  min-1;
        }else{
            return dp[i][j] =  min;
        }
        
        
        
    }
    
    
    
    
    
    
    
    public int strangePrinter(String s) {
        
      int dp[][] = new int[s.length()+1][s.length()+1];
        
        for(int rows[] : dp){
            Arrays.fill(rows , -1);
        }
        
        return find(0 , s.length()-1, s , dp);
        
        
        
        
        
        
        
        
    }
}