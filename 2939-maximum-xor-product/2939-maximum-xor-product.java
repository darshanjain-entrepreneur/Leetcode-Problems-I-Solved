class Solution {
    public int maximumXorProduct(long a, long b, int n) {
        
        int mod = (int)(1e9)+7;
        
       for(int i = n-1; i>= 0; i--){
           
           long val = (long)(1) << i;
           
           
           if((a&val) == (b&val)){
               
               
               a = a|val;
               b = b|val;
               
           }else{
               
               if(a>b){
                   
                   long  temp  =a;
                   a = b;
                   b = temp;
                   
               }
               
               a = a|val;
               b = b&(~val);
           }
           
           
           
           
       } 
        
        
        return (int)(((a%mod)*(b%mod))%mod);
        
        
    }
}