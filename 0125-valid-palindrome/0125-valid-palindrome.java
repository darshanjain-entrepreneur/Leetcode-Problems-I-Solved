class Solution {
    public boolean isPalindrome(String s) {
        
          s = s.toLowerCase();
        StringBuilder b = new StringBuilder();
        
        for(int i = 0; i < s.length() ; i++){
            
            char ch = s.charAt(i);
            if(Character.isDigit(ch) || Character.isLetter(ch)){
                b.append(ch);
            }
            
            
        }
        
        
        int start = 0;
        int end = b.length()-1;
        while(start <= end){
            if(b.charAt(start) != b.charAt(end)){
                return false;
            }
            start++;
            end--;
            
        }
        
        
        return true;
        
    }
}