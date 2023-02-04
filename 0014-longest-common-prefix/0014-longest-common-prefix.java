class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        int n = strs.length;
   String ans = "";
        
        String s = strs[0];
        
        for(int i = 0; i < s.length(); i++){
            
            char ch = s.charAt(i);
            boolean match = true;
            
            for(int j = 1; j < n; j++ ){
                
                if(i > strs[j].length() - 1 || strs[j].charAt(i) != ch){
                    match = false;
                    break;
                }
                
                
                
                
            }
            if(match == true){
                ans = ans + ch;
            }else{
                break;
            }
            
        }
        
        return ans;
    }
}