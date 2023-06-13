class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        
        int n = arr.length;
       
            int sum = 0;
        
        for(int i = 0; i < n; i++){
            
             int count= 0;
          count+=arr[i];
            int j = 1;
            int k = 2*j + 1;
            while( k <=( n- i) ) {
               for(int m = i; m<k+i; m++){
                   count = count + arr[m];
               }
                j = j+1;
                k = 2*j+1;
                
                
            }
            
            
            sum+= count;
            
            
        }
      
        return sum;
    }
}