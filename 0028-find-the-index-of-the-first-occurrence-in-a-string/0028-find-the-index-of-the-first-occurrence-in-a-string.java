class Solution {
    public int strStr(String haystack, String needle) {
        
        int i = 0;
        int n  = haystack.length();
        
        while( n -i >= needle.length()){
            
            
            if(haystack.startsWith(needle)){
                
                return i;
            }else{
                
                String b = haystack.substring(1);
                haystack = b;
                i++;
            }
            
            
            
            
            
        }
        
     
        
        
        return -1;
        
        
    }
}