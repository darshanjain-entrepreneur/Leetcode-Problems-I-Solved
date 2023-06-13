class Solution {
    public int finalValueAfterOperations(String[] operations) {
        
        int x = 0;
        
        for(String st : operations){
            
            if(st.charAt(0) == '-'){
                x = x-1;
            }else if(st.charAt(0) == '+'){
                
                x = x + 1;
            }else{
                
                if(st.charAt(1) == '+'){
                    x = x + 1;
                }else{
                    
                    x = x-1;
                }
                
            }
            
            
            
            
            
            
            
        }
        
        return x;
        
    }
}