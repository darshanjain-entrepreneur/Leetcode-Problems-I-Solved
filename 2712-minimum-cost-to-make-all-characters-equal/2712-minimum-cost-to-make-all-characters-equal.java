class Solution {
    public long minimumCost(String s) {
        
        
        long ans = 0;
        
        for(int i = 1; i < s.length(); i++){
            
          if(s.charAt(i) != s.charAt(i-1)){
                ans = ans + Math.min(i , s.length()-i);
          }
        }
        
        return ans;
    }
}