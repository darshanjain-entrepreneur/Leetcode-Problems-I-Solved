class Solution {
    public String removeKdigits(String num, int k) {
        
        
       
        
        
        Stack<Integer> st = new Stack<>();
        
        
        StringBuilder bb = new StringBuilder();
        
        for(int i = 0; i < num.length(); i++){
            
            int a = (int)(num.charAt(i) - '0');
            
            if(st.isEmpty()){
                
                st.add(a);
                continue;
            }
            
            while(!st.isEmpty() && k > 0 && st.peek() > a){
                
                st.pop();
                k--;
            }
            
            st.add(a);
            
            
        }
        
        
        while(k > 0){
            st.pop();
            k--;
        }
        
        
       while(!st.isEmpty()){
           
           bb.append(st.pop());
       } 
        bb.reverse();
        
     
        
       int index = -1;
        
        for(int i = 0; i< bb.length(); i++){
            if(bb.charAt(i) != '0'){
                break;
            }else{
                
                index = i;
                
            }
        }
        
       String c = bb.toString();
        if(index != -1){
            c = bb.substring(index+1 , bb.length());
        }
        if(c.length() == 0){
            c = "0";
        }
        return c;
    }
}