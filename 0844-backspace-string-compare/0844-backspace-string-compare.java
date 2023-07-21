class Solution {
    public boolean backspaceCompare(String s, String t) {
        
        
        StringBuilder b1 = new StringBuilder();
        
        StringBuilder b2 = new StringBuilder();
        
        for(int i=0; i < s.length(); i++){
            
            if(s.charAt(i) == '#'&&b1.length()> 0){
                
                b1.delete(b1.length()-1 , b1.length());
                
            }else{
                
                if(s.charAt(i) != '#'){
                    b1.append(s.charAt(i));
                }
                
                
            }
            
            
            
        }
        
          for(int i=0; i < t.length(); i++){
            
            if(t.charAt(i) == '#'&&b2.length()> 0){
                
                b2.delete(b2.length()-1 , b2.length());
                
            }else{
                
                if(t.charAt(i) != '#'){
                    b2.append(t.charAt(i));
                }
                
                
            }
            
            
            
        }
        
      
        String c1 = b1.toString();
        String c2 = b2.toString();
        
        if(c1.equals(c2)){
            return true;
        }
        
        
        return false;
        
    }
}