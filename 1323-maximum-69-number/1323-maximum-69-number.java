class Solution {
    public int maximum69Number (int num) {
        
        String a = num + "";
        
        int index = -1;
        
        for(int i = 0; i < a.length(); i++){
            
            if(a.charAt(i) == '6'){
                
                index = i;
                break;
            }
            
            
            
            
            
            
        }
        
        
        if(index == -1){
            
            return num;
        }
        
        
        int sum = 0;
        
       for(int i = 0; i < a.length(); i++){
           
             if(index == i){
               
               sum = sum*10 + 9;
               
           }else{
                 
                  int b = (int)(a.charAt(i) - '0');
           
         sum = sum*10 + b;
             }
           
           
          
           
           
       }
        return sum;
        
    }
}