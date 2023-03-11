class Solution {
    public int longestValidParentheses(String s) {
        
        if(s.length() == 0 || s.length() == 1){
            return 0;
        }
       
        
        int ans = 0;
        
        
        Stack<Integer> it = new Stack<>();
        it.add(-1);
        
        for(int i = 0; i < s.length(); i++){
            
            char ch = s.charAt(i);
            
            
            if(ch == '('){
              
                it.add(i);
            }else{
             
                it.pop();
                if(it.isEmpty()){
                    
                    it.add(i);
                    
                }else{
                    ans = Math.max(ans , i - it.peek());
                }
                
                
            }
            
            
            
        }
        return ans;
        
    }
}