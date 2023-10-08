class Solution {
    public int maxSum(List<Integer> nums, int k) {
        
        
      long MOD = (long)(1e9) + 7;
        
        
        int ans[] = new int[k];
        
        for(int i = 0; i <= 31; i++){
            
            int count = 0;
            
            for(int j = 0; j < nums.size(); j++){
                
                int a = nums.get(j);
                if( ((a>>i) & 1) == 1){
                    
                    count++;
                }
                
                
            }
            
            
            if(count > k){
                
                count= k;
            }
      
            for(int j = 0; j < count; j++){
                  
                ans[j] = ans[j] | (1<<i);
                  
            }
            
        }
        
      long result = 0;
     
        for(int i = 0; i < k; i++){
            
         long  a = (long)(ans[i])%(MOD);
         long  b = (long)(a*a)%MOD;
            result = (result + b)%MOD;
            
        }
        
        
        return (int)(result);
        
        
    }
}