class Solution {
    public boolean isPowerOfThree(int n) {
        
        if(n<= 0){
            return false;
        }
        if(n ==1){
            return true;
        }
        
        if(n%3 != 0){
            return false;
        }
        
        
        for(int j =0;(int)(Math.pow(3 ,j))<=n; j++ ){
            
            int a = (int)(Math.pow(3 , j));
            System.out.println(a);
            if(a == n){
                return true;
            }
            
        }
        
        return false;
        
    }
}