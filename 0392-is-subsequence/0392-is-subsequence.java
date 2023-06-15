class Solution {
    public boolean isSubsequence(String s, String t) {
        
        
        Boolean dp[][] = new Boolean[s.length() + 1][t.length() + 1];
        
        
        
        return find(0 , 0 , s, t , dp);
        
        
   
    }
    
    public boolean find(int start , int end , String s ,String t , Boolean dp[][]){
        
       if(start == s.length()){
           return true;
       }
        
        if(end == t.length()){
            return false;
        }
        
        if(dp[start][end] != null){
            return dp[start][end];
        }
        
        
   if(s.charAt(start) == t.charAt(end)){
       
       return find(start+1 , end +1, s , t , dp);
       
       
   }
       
        
      return dp[start][end] =  find(start , end + 1 , s , t , dp);
       
     
       
        
    }
    
    
    
    
    
    
}