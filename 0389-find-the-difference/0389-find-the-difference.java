class Solution {
    public char findTheDifference(String s, String t) {
        
        
        
        
        int sol = 0;
        
        
        for(int i = 0; i < s.length(); i++){
            
            int a = (int)(s.charAt(i) - 'a');
            
            sol = sol^a;
            
        }
        
        
        for(int i = 0; i < t.length(); i++){
            
            int a = (int)(t.charAt(i) - 'a');
            
            sol = sol^a;
            
        }
        
        
        
        char ans = (char)(sol + 'a');
        
        return ans;
        
        
        
    }
}