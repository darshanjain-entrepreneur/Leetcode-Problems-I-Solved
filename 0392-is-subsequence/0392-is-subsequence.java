class Solution {
    public boolean isSubsequence(String s, String t) {
        
        
        int dp[][] = new int[s.length() + 1][t.length() + 1];
        
        for(int rows[] : dp){
            
            Arrays.fill(rows , -1);
        }
        
        return find(0 , 0 , s, t , dp);
        
        
   
    }
    
    public boolean find(int start , int end , String s ,String t , int dp[][]){
        
       if(start == s.length()){
           return true;
       }
        
        if(end == t.length()){
            return false;
        }
        
        if(dp[start][end] != -1){
           
            if(dp[start][end] == 0){
                return false;
            }else{
                return true;
            }
            
        }
        
        
   if(s.charAt(start) == t.charAt(end)){
       
       return find(start+1 , end +1, s , t , dp);
       
       
   }
       
        
     boolean a =   find(start , end + 1 , s , t , dp);
       
     if(a){
         dp[start][end] = 1;
     }else{
         dp[start][end] = 0;
     }
       
        return a;
    }
    
    
    
    
    
    
}