class Solution {
    public int balancedStringSplit(String s) {
        
        int bc= 0;
        int count = 0;
        
        for(int i= 0; i < s.length(); i++){
            
            if(s.charAt(i) == 'R'){
                bc = bc + 1;
            }else{
                
                bc = bc -1;
            }
            
            if(bc == 0){
                
                count++;
            }
            
            
            
        }
        
        
        return count;
    }
}