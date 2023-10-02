class Solution {
    public boolean winnerOfGame(String colors) {
        
        if(colors.length() <= 2){
            
            return false;
        }
        
        
        
        int a = 0;
        int b = 0;
        
        for(int i=1; i < colors.length()-1; i++){
            
            char c1 = colors.charAt(i);
            char c2 = colors.charAt(i-1);
            char c3 = colors.charAt(i+1);
            
            if(c1 == c2 && c2 == c3 && c3 == 'A'){
                a++;
            }else if(c1 == c2 && c2 ==c3 && c3 == 'B'){
                b++;
            }
            
        }
        
        if(a  > b){
            return true;
        }
        return false;
    }
}