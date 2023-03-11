class Solution {
    public int minAddToMakeValid(String s) {
        
        if(s == ""){
            return 0;
        }
        
     int n = s.length();
        Stack<Character> st = new Stack<>();
        
        for(int i = 0; i < n; i++){
            
           char ch = s.charAt(i);
            if( ch== '(' ){
                
                st.push(ch);
                
                
                
            }else{
                
                 if(  st.isEmpty() == false &&   ch == ')' && st.peek() == '('){
                    st.pop();
                }else{
                     
                     st.push(ch);
                     
                 }
                
                
                
                
                
                
                
            }
           
            
            
            
            
            
            
        }
        
        return st.size();
    }
}