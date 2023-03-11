class Solution {
    public int longestValidParentheses(String s) {
        
        if(s.length() == 0 || s.length() == 1){
            return 0;
        }
       
        
        int ans = 0;
        
        Stack<Character> st = new Stack<>();
        Stack<Integer> it = new Stack<>();
        it.add(-1);
        
        for(int i = 0; i < s.length(); i++){
            
            char ch = s.charAt(i);
            
            
            if(ch == '('){
                st.add(ch);
                it.add(i);
            }else{
                
                if(!st.isEmpty()){
                    
                    st.pop();
                    it.pop();
                    ans = Math.max(ans , i - it.peek());
                    
                }else{
                    
                    it.add(i);
                    
                }
                
                
                
            }
            
            
            
        }
        return ans;
        
    }
}