class Solution {
    public String simplifyPath(String path) {
        
        
       Stack<String> st = new Stack<>();
         Stack<String> st2 = new Stack<>();
        StringBuilder bc = new StringBuilder();
        bc.append('/');
        int i = 0;
        
        while(i < path.length()){
            
            char ch = path.charAt(i);
            
        if(ch == '/'){
            
            i++;
        }else{
            
            StringBuilder b = new StringBuilder();
            
            if(path.charAt(i-1) == '/' && path.charAt(i) == '.'){
                
                while(i < path.length() && path.charAt(i) != '/'){
                    
                    b.append(path.charAt(i));
                    i++;
                }
                
                if(b.length() == 2 && b.charAt(0) == '.' && b.charAt(1) == '.'){
                    
                    if(!st.isEmpty()){
                        st.pop();
                        
                    }
                    
                    
                }else if(b.length() >=2){
                    
                    st.add(b.toString());
                }else{
                    
                    
                }
                
                
            }else{
                
                while(i < path.length() && path.charAt(i) != '/'){
                    
                    b.append(path.charAt(i));
                    i++;
                    
                }
                
                st.add(b.toString());
                
                
            }
            
            
        }
        
            
            
            
            
        }
        
        
        
        
        
        
        
         while(!st.isEmpty()){
            
        st2.add(st.pop());
            
            
        }
        
        
        
        
        while(!st2.isEmpty()){
            
            bc.append(st2.pop());
            bc.append('/');
            
            
        }
        
        
        if(bc.length() > 1){
           
            bc.delete(bc.length() -1 , bc.length());
            
        }
        
return bc.toString();
        
    }
}