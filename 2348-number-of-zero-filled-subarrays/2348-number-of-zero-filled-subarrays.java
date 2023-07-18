class Solution {
    public long zeroFilledSubarray(int[] nums) {
        
        long arr[] = new long[nums.length+1];
        int count = 0;
        
        for(int i =0; i < nums.length; i++){
            
            if(nums[i] == 0){
                count++;
                
               if(i == nums.length-1){
                     for(int j = 1; j <=count; j++){
                       
                       if(j==1 || j==count){
                           arr[j] = arr[j] + count/j;
                       }else{
                          arr[j] = arr[j]+count-j+1;
                       }
                       
                       
                       
                   }  
                     
                
                   
                       } 
                
                
                
                
                
                
                //ifi==0
            }else{
                  for(int j = 1; j <=count; j++){
                       
                       if(j==1 || j==count){
                           arr[j] = arr[j] + count/j;
                       }else{
                          arr[j] = arr[j]+count-j+1;
                       }
                       
                       
                       
                   }  
              count = 0;
            }
            
            
            
            
        }
        
        long sum = 0;
        for(long i : arr){
            
            sum = sum + i;
        }
        
        
        return sum;
        
    }
}