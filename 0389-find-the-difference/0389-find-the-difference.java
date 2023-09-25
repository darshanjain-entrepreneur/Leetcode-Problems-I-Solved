class Solution {
    public char findTheDifference(String s, String t) {
        
        
        
        
        int sol = 0;
        
        
        for(int i = 0; i < t.length(); i++){
            
       if(i == t.length()-1){
           
           int a = (t.charAt(i) - 'a');
               sol = sol^a;
       }else{
           
           
           int b = (s.charAt(i) - 'a');
           
            int a = (t.charAt(i) - 'a');
               sol = sol^a;  
                   sol = sol^b;
           
       }
            
            
        
            
        }
        
        
        
        
        
        
        char ans = (char)(sol + 'a');
        
        return ans;
        
        
        
    }
}