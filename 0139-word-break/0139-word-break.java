class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        
        int n = s.length();
        
        boolean ans[] = new boolean[1];
        Boolean  dp[][] = new Boolean[n + 1][n + 1];
        
     
        
        
        return find("" , 0 , s , wordDict , ans , dp );
    }
    
    
    public boolean find( String p , int i , String s ,List<String> d , boolean ans[] , Boolean dp[][] ){
        
        if(i == s.length()){
            
         
            
            if(d.contains(p)){
                
                ans[0] = true;
                return true;
                
                
            }
            
            
          
            return false;
            
        }
        
        
          if(dp[i - p.length() + 1][i] != null){
            
            return dp[i - p.length() + 1][i];
        }
        
        
        
        if(d.contains(p)){
            
             find("" , i , s , d , ans , dp);
            
            if(ans[0] == true){
                
                return true;
            }
            
            
        }
        
        
      
        
        
        char ch = s.charAt(i);
        
        return dp[i - p.length() + 1][i] =  find(p +ch , i+1 , s , d, ans , dp);
        
        
        
        
        
        
        
        
        
        
    }
    
    
    
    
}