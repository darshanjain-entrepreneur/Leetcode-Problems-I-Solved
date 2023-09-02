class Solution {
    public int minExtraChar(String s, String[] dict) {
        
        
    HashMap<String , Integer> map = new HashMap<>();
        
        for(String  ss : dict){
            
            map.put(ss , 1);
            
            
        }
        
        int dp[] = new int[51];
        
        Arrays.fill(dp , -1);
        
        return find(0 , map , s , dp);
        
        
    }
    
    public int find(int index  , HashMap<String , Integer> map ,String s , int dp[] ){
        
        if(index >= s.length()){
            return 0;
        }
        
        
        int min = (int)(1e9);
        
        if(dp[index]!= -1){
            return dp[index];
        }
    
        
        for(int i = index; i < s.length(); i++){
            
            String st = s.substring(index , i+1);
            
            int extra = 0;
            
          if(!map.containsKey(st)){
              extra = st.length();
          }
           
            int remaining = find(i+1 , map , s, dp);
            int total = extra + remaining;
            
            min = Math.min(total ,min);
            
        }
        
        
        
        
   return dp[index] =  min;
        
    }
}