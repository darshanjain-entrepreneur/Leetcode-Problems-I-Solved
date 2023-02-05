class Solution {
    public int characterReplacement(String s, int k) {
        // Sliding Window Problem
        
        
        char count[] = new char[26];
        int maxlength = 0;
        int maxcount = 0;
        int start = 0;
        
        for(int end = 0; end < s.length(); end++){
            
            count[s.charAt(end) - 'A']++;
            maxcount = Math.max(maxcount , count[s.charAt(end) - 'A']);
            
            while(end - start  + 1 - maxcount > k  ){
                count[s.charAt(start) - 'A']--;
                start++;
                
            }
            
            maxlength = Math.max(maxlength , end - start + 1);
            
            
        }
        
        return maxlength;
    }
}