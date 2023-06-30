class Solution {
    public String minRemoveToMakeValid(String s) {
        
      Stack<Integer> st = new Stack<>();
        Stack<Integer> st2 = new Stack<>();
        StringBuilder b = new StringBuilder();
        
        for(int i = 0; i < s.length(); i++){
            
            
            char ch = s.charAt(i);
            
            if(ch =='('){
                
                st.add(i);
             
                
            }else if(ch == ')'){
                
                if(st.isEmpty()){
                    st2.add(i);
                    
                }else{
                    
                    st.pop();
                }
                
            }else{
                
                
                
            }
            
            
            
            
            
        }
        
        
        
        for(int i = s.length()-1; i >= 0; i--){
            
            
            if(!st.isEmpty() && st.peek() == i){
                
                st.pop();
                
            }else if(!st2.isEmpty() && st2.peek() == i){
                st2.pop();
                
            }else{
                
                b.append(s.charAt(i));
            }
            
            
            
            
            
        }
        
        
b.reverse();
        
        return b.toString();
        
        
    }
}