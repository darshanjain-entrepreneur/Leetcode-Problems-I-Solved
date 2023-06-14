class Solution {
    public String interpret(String st) {
        
        StringBuilder b = new StringBuilder();
        int count = 0;
        int temp = 0;
        
        for(int i = 0; i < st.length(); i++){
            
            if(st.charAt(i) == 'G'){
                
                b.append('G');
            }else if(st.charAt(i) == '('){
                
                count = 1;
            }else if( st.charAt(i) == ')'){
                
                if(temp == 1){
                    b.append("al");
                    temp = 0;
                }else{
                    
                    count = 0;
                    b.append('o');
                }
               
            }else if(st.charAt(i) == 'a'){
                temp = 1;
                count = 0;
            }else if(st.charAt(i) == 'l'){
                
                
                
            }
            
            
            
            
        }
        
        return b.toString();
    }
}