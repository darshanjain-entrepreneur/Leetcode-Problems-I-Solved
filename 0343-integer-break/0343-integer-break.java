class Solution {
    public int integerBreak(int n) {
        
        if(n==2 || n==3){
            return n-1;
        }
        
        int a = n/3;
        int b = (int)(Math.pow(3 , a));
        int c = n-(3*a);
        c = c/2;
        int d = (int)(Math.pow(2 , c));
        int ans = b*d;
        
    
        while(a >= 0){
          
         b = (int)(Math.pow(3 , a));
       c = n-(3*a);
        c = c/2;
       d = (int)(Math.pow(2 , c));
      ans = Math.max(ans , b*d);
            a--;
        }
        
        
        
       return ans;
    }
}