//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            String s; 
            s = br.readLine();
            
            Solution obj = new Solution();
            int res = obj.checkRedundancy(s);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends


class Pair{
    
    char ch;
    boolean flag = false;
    public Pair(char ch){
        
        this.ch = ch;
       
    }
    
}

class Solution {
    public static int checkRedundancy(String s) {
      
      if(s.length() == 0 || s.length() == 1){
          
          return 0;
          
      }
     
          
      Stack<Pair> st = new Stack<>();
      
      for(int i = 0; i < s.length(); i++){
          
          char ch = s.charAt(i);
          
          if(ch == '('){
              
              st.add(new Pair(ch));
              
          }else if(ch == '+' || ch =='-' || ch=='/' || ch=='*'){
              
              
              st.peek().flag = true;
              
          }else if(ch == ')'){
              
              if(st.isEmpty()){
                  return 1;
              }
              if(st.peek().flag){
                  
                  st.pop();
                  
                  
              }else{
                  
                  return 1;
                  
              }
              
              
          }
          
          
          
      }
          
          
          
      
      
      return 0;
      
      
    }
}
        
