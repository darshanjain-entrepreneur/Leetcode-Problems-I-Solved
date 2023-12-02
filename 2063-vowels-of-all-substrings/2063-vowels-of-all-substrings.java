class Solution {
    public long countVowels(String word) {
        
        int n = word.length();
        long ans = 0; 
        
        for(int i = 0; i < word.length(); i++){
            
            char c = word.charAt(i);
            
            if(isVowl(c)){
                
                ans = ans + (long)(i+1)*(long)(n-i);
            }
            
        }
        return ans;
        
    }
    
    public boolean isVowl(char c){
        return (c == 'a') || (c=='e') || (c == 'i') || (c =='o') || (c=='u');
    }
    
}