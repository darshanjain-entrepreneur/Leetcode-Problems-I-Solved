class Solution {
    
    public boolean compare(String present , String prev , String words[]){
        
        if(present.length() != 1 + prev.length()){
            
            return false;
        }
        
        int i = 0;
        int j = 0;
        
        while(i < present.length()){
            
        if(  j < prev.length() &&  present.charAt(i) == prev.charAt(j)){
            
            i++;
            j++;
        }else{
            i++;
        }
            
            
            
            
        }
        
     if( i== present.length() && j == prev.length()){
         return true;
     }else{
         return false;
     }
        
        
    }
    
    
    
    
    public int longestStrChain(String[] words) {
        
        int n = words.length;
        
        int dp[] = new int[n];
        int maxi = -1;
        Arrays.fill(dp , 1);
        Arrays.sort(words, (a, b)->a.length() - b.length());
        
        
        
        for(int i = 0; i < n; i++){
            
            for(int prev = 0; prev < i; prev++){
                
                if(compare(words[i] , words[prev] , words) && 1+ dp[prev] > dp[i]){
                    
                    dp[i] = 1 + dp[prev];
                    
                  
                    
                    
                }
               
                
            }
               maxi = Math.max(maxi , dp[i]);
        }
        
        return maxi;
        
    }
}