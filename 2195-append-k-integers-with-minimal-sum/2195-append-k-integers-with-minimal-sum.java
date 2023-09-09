class Solution {
    public long minimalKSum(int[] nums, int k) {
        
        
     Arrays.sort(nums);
        
        
        long sum = 0;
        
        int prev = 0;
        
        int start = 0;
        
        while(start < nums.length && k > 0){
            
            
          if(nums[start] - prev -1 == 0 ){
              prev = nums[start];
              start++;
              
          }else{
              
            for(int i = prev+1 ; i < nums[start] && k > 0; i++){
                
                sum = sum + i;
                
                k--;
            }
              
              
                   prev = nums[start];
              start++;
              
          }  
            
            
            
            
        }
        
        
        if(k == 0){
            
            return sum;
        }
        
       
  int a = nums[nums.length-1] + 1;
        
        while( k > 0){
            sum = sum + a;
            a++;
            k--;
        }
        
        
        return sum;
    }
}