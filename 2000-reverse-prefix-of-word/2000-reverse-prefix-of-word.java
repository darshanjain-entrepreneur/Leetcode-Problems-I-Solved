class Solution {
    public String reversePrefix(String word, char ch) {
        
        
        StringBuilder b = new StringBuilder();
        int count = 0;
        
        for(int i = 0; i < word.length(); i++){
            
            if(word.charAt(i) == ch && count == 0){
                
                b.append(word.charAt(i));
                b.reverse();
                count = 1;
            }else{
                
                b.append(word.charAt(i));
            }
            
            
            
            
            
        }
        
        return b.toString();
        
    }
}