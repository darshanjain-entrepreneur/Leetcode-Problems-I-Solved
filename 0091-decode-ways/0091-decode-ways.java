class Solution {
    public int numDecodings(String s) {
        
        
        int dp[] = new int[s.length() + 1];
        Arrays.fill(dp , -1);
        
        return find(0 , s , s.length() , dp);
        
        
        
        
        
        
        
        
        
    }
    public int find(int pos , String s  , int n , int dp[]){
        
      if(pos == n){
          
          return 1;
      }  
        
        if(s.charAt(pos) == '0'){
            
            return 0;
        }
        
        if(dp[pos] != -1){
            return dp[pos];
        }
        
        
        int count = find(pos + 1 , s , n , dp);
        
        if(pos < n-1){
            
            String st = s.substring(pos , pos + 2);
            int a = st.charAt(0) - '0';
            int b = st.charAt(1) - '0';
            
            int c = a*10 + b;
            if(c < 27){
                
                count+= find(pos + 2 , s , n , dp);
            }
        }
        
        
        
        
        return dp[pos] =  count;
        
        
        
    }
}