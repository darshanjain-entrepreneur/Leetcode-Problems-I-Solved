class Solution {
    public String intToRoman(int num) {
        
        
       String set[] = {"M" , "CM" , "D" , "CD" ,"C" , "XC" , "L" , "XL" , "X" , "IX" , "V" , "IV" , "I"};
        int set1[] = {1000 , 900 , 500 , 400 , 100 , 90 , 50 , 40 ,10 , 9 , 5 , 4 , 1};
        
        StringBuilder b = new StringBuilder();
        
        for(int pos = 0; num > 0 ; pos++){
            
            while(num >= set1[pos]){
                
                b.append(set[pos]);
                num = num - set1[pos];
                
            }
            
            
            
            
            
        }
        
        return b.toString();
    }
}