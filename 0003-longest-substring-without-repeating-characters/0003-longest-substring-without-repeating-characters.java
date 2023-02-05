class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        
        HashSet<Character> set = new HashSet<>();
        
        int left = 0;
        int right = 0;
        int maxi = 0;
        
        while(right < s.length()){
            
            char c = s.charAt(right);
            
            if(set.add(c)){
                
                
                maxi = Math.max(maxi , right-left + 1);
                right++;
                
                
                
            }else{
                
                while(s.charAt(left) != c){
                    
                    set.remove(s.charAt(left));
                    left++;
                    
                }
                
                set.remove(c);
                left++;
                
                
                
            }
            
            
            
            
            
            
        }
        
        return maxi;
        
    }
}