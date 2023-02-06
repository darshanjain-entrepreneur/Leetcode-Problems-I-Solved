class Solution {
    int count = 0;
    
    
    public void findpalindrome(int left , int right , String s){
        
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            
            count++;
            left--;
            right++;
            
            
            
        }
        
        
        
        
        
    }
    
    
    
    
    
    
    
    
    public int countSubstrings(String s) {
        
        
        for(int i = 0; i < s.length(); i++){
            
            
            findpalindrome(i , i , s);
            findpalindrome(i , i + 1 , s);
            
            
            
            
        }

        return count;
        
    }
}