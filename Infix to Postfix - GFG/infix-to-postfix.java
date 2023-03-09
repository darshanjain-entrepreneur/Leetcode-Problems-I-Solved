//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {

    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            System.out.println(
                new Solution().infixToPostfix(br.readLine().trim()));
        }
    }
}
// } Driver Code Ends


class Solution {
    
    public static String infixToPostfix(String exp) {
      
      
      StringBuilder st = new StringBuilder();
      Stack<Character> s = new Stack<>();
      
      
      
      for(int i = 0; i < exp.length(); i++){
          
          char ch = exp.charAt(i);
          
          if(ch == '('){
              s.add(ch);
          }
          else if(ch == '+' || ch=='-' || ch=='/' || ch=='*' || ch=='^'){
              
              if(s.isEmpty()){
                  
                  s.add(ch);
                  
              }else{
                  
                  if(ch== '^'){
                      while( !s.isEmpty()&&  s.peek() =='^'){
                          st.append(s.pop());
                      }
                      s.add(ch);
                      
                  }else if(ch == '/' || ch == '*'){
                      
                      while(!s.isEmpty()&&(s.peek() == '^' || s.peek()=='/' || s.peek()=='*')){
                          st.append(s.pop());
                      }
                      s.add(ch);
                      
                  }else{
                      
     while(!s.isEmpty()&&(s.peek() == '/'|| s.peek()=='*' || s.peek()=='^'||s.peek()=='+'||s.peek()=='-')){
         
         st.append(s.pop());
     }
                      
                    s.add(ch);  
                      
                  }
                  
                  
                  
              }
              
              
          }else if(ch == ')'){
              
              while(!s.isEmpty()){
                  
                  if(s.peek() == '('){
                      s.pop();
                      break;
                  }else{
                      st.append(s.pop());
                  }
                  
                  
              }
              
              
          }else{
              
              st.append(ch);
              
          }
          
          
          
          
      }
      
      while(!s.isEmpty()){
          st.append(s.pop());
      }
      
      return st.toString();
    }
}