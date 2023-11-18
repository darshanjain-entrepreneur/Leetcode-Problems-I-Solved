class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        
        int index = -1;
 
       for(int i = 30;  i>= 0 ;i--){
           
           
        int a = (left>>i)&1;
           
           int b = (right>>i)&1;
           
           if(a != b){
               
               index = i;
               break;
           }
           
           
           
           
           
       }
        
        System.out.println(index);
        
        for(int i = 0; i<=index; i++){
            
         int a = (left>>i)&1;
            
            System.out.println(a+"loop");
            
            if(a == 1){
                
                left = left ^ (1<<i);
                System.out.println(left);
            }
            
            
        }
        
        
        
        return left;
        
    }
}