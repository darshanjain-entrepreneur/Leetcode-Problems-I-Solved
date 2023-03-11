class Solution {
    public int longestValidParentheses(String s) {
        
        if(s.length() == 0 || s.length() == 1){
            return 0;
        }
       
        
        int ans = 0;
        
        
       int left;
        int right;
        left = right = 0;
        
        for(int i = 0 ; i< s.length(); i++){
            
            char ch = s.charAt(i);
            
            if(ch == '('){
                
                left++;
                
            }else{
                right++;
                
              
                
                
                
            }
              if(right == left){
                    ans = Math.max(ans , 2*right);
                }else if(right > left){
                    
                    right = left = 0;
                }
            
            
            
        }
        
        
        
        right = left = 0;
        for(int i = s.length() - 1; i >= 0; i--){
            
            char ch = s.charAt(i);
            if(ch == '('){
                
                left++;
            }else{
                
                right++;
                
              
            }
            
              if(right==left){
                    ans = Math.max(ans , 2*right);
                }else if(left > right){
                    
                    left = right = 0;
                }
            
            
            
            
        }
        
        
        
        return ans;
        
        
    }
}