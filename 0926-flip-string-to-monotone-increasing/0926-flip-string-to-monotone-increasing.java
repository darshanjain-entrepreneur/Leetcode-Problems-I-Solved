class Solution {
    
    public int minFlipsMonoIncr(String s) {
        
        
        int countflip = 0;
        int one = 0;
        
        
        for(int i = 0; i < s.length(); i++){
            
            if(s.charAt(i) == '1'){
                
                one++;
            }
            
            
            if(s.charAt(i) == '0')
            
            
            if(s.charAt(i) == '0' && one > 0){
                
                countflip++;
                
                
            }
            
            
            if(countflip > one){
                
                countflip = one;
            }
            
            
            
        }
        
        
        
        return countflip;
        
      
    }
}