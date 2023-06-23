class Solution {
    public String addStrings(String num1, String num2) {
        
        StringBuilder bb = new StringBuilder();
        
        int i = num1.length()-1;
        int j = num2.length()-1;
          int borrow = 0;
        
        while(i >= 0 || j >= 0){
            
            
            int a = 0;
            int b = 0;
          
            if(i >= 0){
                
                a = (int)(num1.charAt(i) - '0');
                i--;
                
            }
            
            if(j >= 0){
                
                b = (int)(num2.charAt(j) - '0');
                j--;
            }
            
            int c = a + b+borrow;
            
            if(c >= 10){
                
                int k = c%10;
                borrow = 1;
                bb.append(k);
                
            }else{
                
                bb.append(c);
                borrow = 0;
                
            }
            
            
            
        }
        
        
        if(borrow == 1){
            bb.append(1);
        }
        
        bb.reverse();
        return bb.toString();
        
    }
}