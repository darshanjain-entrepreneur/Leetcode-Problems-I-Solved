class Solution {
    public int[] plusOne(int[] digits) {
        
        
        if(digits[0] == 9){
            
            
            
            int arr[] = new int[digits.length+1];
            int borrow = 1;
            
            for(int i =  digits.length-1; i >= 0; i--){
                
                if(borrow == 0){
                    return digits;
                }
                
                
                digits[i] = digits[i]+borrow;
                
                arr[i] = digits[i];
                if(digits[i] >=10){
                  digits[i] =   digits[i]%10;
                     arr[i] = digits[i];
                    borrow = 1;
                    
                }else{
                    
                    borrow = 0;
                }
                
                
                
            }
            
            if(borrow == 1){
                arr[0] = 1;
                return arr;
            }else{
                
                return digits;
            }
            
            
            
        }else{
            int borrow = 1;
            
            for(int i = digits.length-1; i>=0; i--){
                
                if(borrow == 0){
                    break;
                }
                
                
                digits[i] = digits[i]+borrow;
                
                if(digits[i] >= 10){
                    digits[i] = digits[i]%10;
                    borrow = 1;
                }else{
                    
                    borrow = 0;
                }
                
                
                
                
                
            }
            
            
            
            
            return digits;
            
            
            
        }
        
        
        
        
        
        
    }
}