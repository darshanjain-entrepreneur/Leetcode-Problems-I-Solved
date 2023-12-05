class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        
        long sum = 0;
        

        
         long count[] = new long[(int)(2e5)];
        
        
        
        for(int i = 0; i < nums1.length; i++){
            
            
            count[Math.abs(nums1[i] - nums2[i])]++;
            
            
        }
        
        
        
        long op = k1+k2;
        
        
        
        
        for(int i = count.length-1; i >= 1; i--){
            
            
            if(count[i] <= op){
                
               if(i > 0 ){
                   count[i-1] = count[i-1]+count[i];
                   op = op - count[i];
                   count[i] = 0;
               }
            }else{
                
            count[i-1]+=op;
                count[i] = count[i] - op;
                break;
                
                
            }
            
            
            
            
        }
        
        
  
        for(int i = 1; i < count.length; i++){
            
            sum = sum + (long)(i)*(long)(i)*count[i]; 
            
        }
        
        
        
     
        return sum;
        
    }
}