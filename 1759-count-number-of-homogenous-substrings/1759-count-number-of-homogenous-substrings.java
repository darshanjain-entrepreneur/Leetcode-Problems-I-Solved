class Solution {
    public int countHomogenous(String s) {
        
        
 long sum = 0;
        
        int mod = (int)(1e9)+7;
        
        int n = s.length();
        int start = 0;
        int end = 0;
        
        while(start <= end && end <n ){
            
          
           if(end == n-1 && s.charAt(start) == s.charAt(end)){
               
                  int m = end - start + 1;
                   
                   sum  = (sum  + (long)(m)*(long)(m+1)/(long)2)%mod;
                   System.out.println(m + " second");
               end++;
               
           }else{
               
               if(s.charAt(start) != s.charAt(end)){
                   
                   int m = end - start;
                   
                   System.out.println(m + "first");
                   
                   sum  = (sum  + (long)(m)*(long)(m+1)/(long)2)%mod;

                   start = end;
                   
               }else{
                   
                   
                   
                   end++;
               }
               
               
               
               
               
               
           }
           
            
            
            
            
            
            
            
        }
        
        
        
       return (int)(sum%mod);
        
    }
}