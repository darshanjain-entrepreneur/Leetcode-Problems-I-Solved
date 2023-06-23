class Solution {
    public boolean validPalindrome(String s) {
        
            int n = s.length();
        int count = 0;
        
        
        int start = 0;
        int end = n-1;
        int count1 = 0;
        
        while(start < end){
            
            
            if(s.charAt(start) == s.charAt(end)){
                
                
                start++;
                end--;
                
                
                
            }else{
                
               count1++;
                start++;
                
                
                   }
            
            
            
         }
     
      
        
        
        
        
          start = 0;
         end = n-1;
     int   count2 = 0;
        
        while(start < end){
            
            
            if(s.charAt(start) == s.charAt(end)){
                
                
                start++;
                end--;
                
                
                
            }else{
                
               count2++;
             end--;
                
                
                   }
            
            
            
         }  
        
        
        if(count1 == 1 || count2 == 1){
            return true;
        }
        
        
        
           if(count1 == 0 || count2 == 0){
            return true;
        }
        
        
        return false;
        
    }
}