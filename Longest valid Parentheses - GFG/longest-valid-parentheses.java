//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String S = in.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.maxLength(S));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static int maxLength(String S){
        
        if(S.length() == 1){
            return 0;
        }
        
      int maxi = 0;
        
        Stack<Character> st = new Stack<>();
        Stack<Integer> it = new Stack<>();
        it.add(-1);
        
       for(int i = 0; i < S.length(); i++){
           
           char ch = S.charAt(i);
           if(ch == '('){
               
               st.add(ch);
               it.add(i);
           }else{
               
               if(!st.isEmpty()){
                   
                   st.pop();
                   it.pop();
                   maxi = Math.max(maxi , i - it.peek());
                   
                   
               }else{
                   it.add(i);
               }
               
               
               
           }
           
           
       }
            
            
            
            
        
        return maxi;
      
    }
}