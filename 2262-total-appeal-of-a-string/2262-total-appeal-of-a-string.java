class Solution {
    
    
    public void solve(int i , long freq[] , String s , long n){
        
        char a = (char)(i+'a');
        
        long total = (n+1)*(n)/2;
        
        long cal = 0;
        long start = 0;
        long end = 0;
        
        while( start <= end && end < n){
            
            char c = s.charAt((int)end);
            
           if(end == n-1){
               
               if(c == a){
                   
                   if(start < end){
                         long d = end-start+1;
                    cal = cal + (d*(d-1))/2;
                    end++;
                    start = end;
                       
                   }else{
                       
                       start++;
                       end++;
                   }
                   
                   
               }else{
                   
                  
                   long d = end-start+2;
                   cal = cal + (d*(d-1))/2;
                   end++;
                    start = end;
                   
                   
               }
               
               
               
               
           }else{
                if(c == a){
                
                if(start < end){
                    
                    long d = end-start+1;
                    cal = cal + (d*(d-1))/2;
                    end++;
                    start = end;
                }else{
                    
                    start++;
                    end++;
                }
                
                
                
                
            }else{
                
                end++;
                
                
                
            }
            
           }
            
            
            
        }
        
        
        System.out.println(cal + " " + total + " " + a);
      freq[i] = total - cal;  
        
        
        
    }
    
    
    
    
    
    public long appealSum(String s) {
        
        long freq[] = new long[26];
        long n = (long)(s.length());
        
     for(int i = 0; i < 26; i++){
         
         
         solve(i , freq , s , n);
         
         
         
         
     }
        
        
        long ans = 0;
        for(long i : freq){
            ans = ans+i;
            
        }
        
        return ans;
    }
}