class Solution {
    public String sortSentence(String s) {
        
        String arr[] = new String[10];
        
        StringBuilder b = new StringBuilder();
        
        
        for(int i = 0; i < s.length(); i++){
            
             if(s.charAt(i) == ' '){
                 
                 
                 
             }else{
                 
                 if(s.charAt(i) >= '1' && s.charAt(i) <= '9'){
                     
                     int k = (int)(s.charAt(i) - '0');
                     arr[k] = b.toString();
                     b.delete(0 , b.length());
                     
                 }else{
                     
                     b.append(s.charAt(i));
                 }
                 
                 
             }
            
            
            
            
            
            
            
        }
        
        
          StringBuilder c = new StringBuilder();
        
        
        for(int i = 1;  i<=9; i++){
            
            if(arr[i] != null){
                
                
                for(int j = 0; j < arr[i].length(); j++){
                    
                    c.append(arr[i].charAt(j));
                    
                }
                
                c.append(" ");
                
            }
            
            
            
            
            
            
        }
        
        
        if(c.charAt(c.length() -1) == ' '){
            
            c.delete(c.length()-1, c.length());
        }
        
        
       return c.toString(); 
    }
}