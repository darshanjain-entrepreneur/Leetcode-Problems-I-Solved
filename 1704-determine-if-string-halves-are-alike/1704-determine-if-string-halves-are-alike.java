class Solution {
    public boolean halvesAreAlike(String s) {
        
        int vowl = 0;
        
        
        
        int n = s.length();
        
            for(int i = 0; i < n/2; i++){
                
        char c = s.charAt(i);
                
         if(c =='a' || c =='e' || c=='i' || c=='o' || c =='u'){
             
             vowl++;
             continue;
         }       
              
                
           if(c =='A' || c =='E' || c =='I' || c =='O' || c=='U'){
               
               vowl++;
           }     
                
                
            } 
        
        
           for(int i = n/2; i < n; i++){
                
        char c = s.charAt(i);
                
         if(c =='a' || c =='e' || c=='i' || c=='o' || c =='u'){
             
             vowl--;
             continue;
         }       
              
                
           if(c =='A' || c =='E' || c =='I' || c =='O' || c=='U'){
               
               vowl--;
           }     
                
                
            } 
        
        
        
        if(vowl == 0){
            return true;
        }
        
        return false;
        
    }
}