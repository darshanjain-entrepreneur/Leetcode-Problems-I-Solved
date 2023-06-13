class Solution {
    public String firstPalindrome(String[] words) {
        
        
        for(String st : words){
            
            
            if(find(st)){
                return st;
            }
            
            
            
            
            
        }
        
        
        return "";
    }
    
    public boolean find(String st){
        
        
        int start = 0;
        int end = st.length() - 1;
        
        
        while(start < end){
            
            if(st.charAt(start) == st.charAt(end)){
                
                start++;
                end--;
            }else{
                
                return false;
            }
            
            
            
        }
        
        return true;
        
        
        
    }
    
    
    
    
    
    
    
    
}