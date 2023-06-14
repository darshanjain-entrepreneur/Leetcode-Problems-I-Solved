class Solution {
    public String addBinary(String a, String b) {
        
      StringBuilder b1 = new StringBuilder(b);
        StringBuilder a1 = new StringBuilder(a);
        
 b1.reverse();
        a1.reverse();
       
       int n = Math.abs(a.length() - b.length());
       
       for(int i =0; i < n; i++){
           
           if(a.length() > b.length()){
               
               b1.append('0');
               
           }else{
               
               a1.append('0');
               
               
               
           }
           
           
           
       
       
       }
       
       

          StringBuilder ans = new StringBuilder();
        System.out.println(a1);
        System.out.println(b1);
        
        int borrow = 0;
        
        for(int i = 0; i < b1.length(); i++){
            
            int x = 0;
            if(a1.charAt(i) == '1'){
                x=1;
            }
            int y = 0;
            if(b1.charAt(i) == '1'){
                y = 1;
            }
            
            if(x == 0 && y == 0){
                
                if(borrow == 1){
                    ans.append(1);
                    borrow = 0;
                }else{
                    ans.append(0);
                }
                
            }else if(x == 1 && y == 1){
                
                if(borrow == 1){
                    
                    ans.append(1);
                    
                }else{
                    borrow = 1;
                    ans.append(0);
                }
                
                
                
                
            }else{
                
                if(borrow == 1){
                    ans.append(0);
                }else{
                    
                    ans.append(1);
                }
                
                
                
            }
            
            
          
            
        }
        
        if(borrow == 1){
            ans.append(1);
        }
        
        ans.reverse();
        
        
        return ans.toString();
        
        
    }
}