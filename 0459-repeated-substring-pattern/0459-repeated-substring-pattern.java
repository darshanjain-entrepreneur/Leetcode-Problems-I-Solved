class Solution {
    public boolean repeatedSubstringPattern(String s) {
        
        if(s.length() == 1){
            return false;
        }
        
        
       for(int i = 0; i < s.length()/2; i++){
           
           String p = s.substring(0 , i+1);
           
        
           String t = s;
           while(t.length() >= p.length()){
               
               if(t.startsWith(p)){
                   if(t.length() == p.length()){
                       return true;
                   }
             
                   
                  t =  t.substring(i+1);
                   
               }else{
                   break;
               }
               
               
           }
           
           
           
           
       } 
        
        
        
        
        
        
        return false;
        
        
        
    }
}