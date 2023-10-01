class Solution {
    public String reverseWords(String s) {
        
        StringBuilder b = new StringBuilder();
          StringBuilder c = new StringBuilder();
        
        int i = 0;
        
        while(i < s.length()){
            
           if(s.charAt(i) == ' '){
               
               i++;
               b.append(" ");
           }else{
               
               
               int k = i;
               while(k < s.length() && s.charAt(k) != ' '){
                   
                   c.append(s.charAt(k));
                  k++;
                  
                   
                   
               }
               
               
               i = k;
               c.reverse();
               b.append(c);
               
               int a = c.length();
               c.delete(0 , a);
               
               
               
           } 
            
            
            
            
            
            
            
        }
        
        
        
        return b.toString(); 
    }
}