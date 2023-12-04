class Solution {
    public String largestGoodInteger(String num) {
        
        
        
        String ans = "";
        
        
        for(int i = 0; i <= 9; i++){
            
            int count = 0;
            char a = (char)(i+'0');
            for(int j = 0; j < num.length(); j++){
                char c = num.charAt(j);
                
                if(count == 3){
                    ans = ""+a+a+a+"";
                 
                    break;
                }
                
                if(c == a){
                    count++;
                }else{
                    count = 0;
                }
                
                
                
            }
            
            if(count == 3){
                     ans = ""+a+a+a+"";
            }
            
            
        }
        
        
        
        return ans;
        
        
    }
}