class Solution {
    public int fib(int n) {
        
        if(n == 0){
            return 0;
        }
        
        int x = 0;
        int y = 1;
        
        
        
        for(int  i =2; i<=n; i++){
            
            int temp = y;
            y = x + temp;
            
            x = temp;
        }
        
        
        return y;
    }
}