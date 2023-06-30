class Solution {
    public String reverseWords(String s) {
        
        if(s.length() == 1){
            return s;
        }
           StringBuilder b = new StringBuilder();
  
        Stack<String> st = new Stack<>();
        int i = 0;
        
      while(i < s.length()){
            
            
            char ch = s.charAt(i);
            
          if(s.charAt(i) != ' '){
           
              
              while(   i < s.length() &&  s.charAt(i) != ' ' ){
                  
                  b.append(s.charAt(i));
                  i++;
                  
                  
              }
              
              st.add(b.toString());
              b.delete(0 , b.length());
              
          }else{
              i++;
          }
            
            
        }
        
        
    while(!st.isEmpty()){
        
        b.append(st.pop());
        b.append(' ');
        
        
        
    }
     
        if(b.charAt(b.length() - 1) == ' '){
            
            b.delete(b.length()-1 , b.length());
        }
        
    return b.toString();
    }
}