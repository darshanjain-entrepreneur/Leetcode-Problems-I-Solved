class Solution {
    public boolean judgeSquareSum(int c) {
        
 if(c == 0 || c == 1 || c==2){
        
        return true;
    }
        
        
   long start = 0; long  end  = (long)(Math.sqrt(c));
        
        
        while(start <= end){
            
          long a = (start*start) + (end*end);
            
            if(a  ==  c){
                return true;
            }else if(a < c){
                start++;
            }else if(a > c){
                
                end--;
            }
            
            
            
        }
        
        
        
        
        return false;
    }
}