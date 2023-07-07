class Solution {
    public String reverseOnlyLetters(String s) {
   
        
        StringBuilder b = new StringBuilder(s);
        
        
        
        int start = 0;
        int end = s.length()-1;
        
        while(start < end){
            
      char startChar = s.charAt(start);
            char endChar = s.charAt(end);
            
     if(((startChar >= 'a' && startChar <='z') || (startChar >='A' && startChar <='Z')) && ((endChar >= 'a' && endChar <='z') || (endChar >='A' && endChar <='Z'))   ){
         
         
          b.setCharAt(start , endChar);
        b.setCharAt(end , startChar);
         
         start++;
         end--;
         
         
         
     }else{
         
         if((startChar >= 'a' && startChar <='z') || (startChar >='A' && startChar <='Z')){
             
         }else{
             
             start++;
         }
        
           if((endChar >= 'a' && endChar <='z') || (endChar >='A' && endChar <='Z')){
             
         }else{
             
             end--;
         }
         
         
         
         
     }
            
            
            
            
            
            
        }
        
        
        
        
        
        return b.toString();
        
        
        
    }
}