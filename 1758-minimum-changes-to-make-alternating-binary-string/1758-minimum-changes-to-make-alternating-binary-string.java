class Solution {
    public int minOperations(String s) {
    
        
       boolean check = false;
        
        int ans = (int)(1e9);
        
        
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            
            
            if(check == false){
                
                if(s.charAt(i) == '1'){
                    
                    count++;
                }
                
                check = true;
            }else{
                
                if(s.charAt(i) == '0'){
                    count++;
                }
                check = false;
            }
            
            
            
        }
        
        
        ans = Math.min(count , ans);
    
        count = 0;
        
        check = true;
        
            for(int i = 0; i < s.length(); i++){
            
            
            if(check == false){
                
                if(s.charAt(i) == '1'){
                    
                    count++;
                }
                
                check = true;
            }else{
                
                if(s.charAt(i) == '0'){
                    count++;
                }
                check = false;
            }
            
            
            
        }
        
        
        ans = Math.min(count , ans);
        
        
        
        
        
        return ans;
        
        
    }
    
}