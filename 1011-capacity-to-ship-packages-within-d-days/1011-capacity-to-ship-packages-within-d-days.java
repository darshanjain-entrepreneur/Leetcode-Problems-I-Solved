class Solution {
    public int shipWithinDays(int[] weights, int days) {
        
        int start = 0;
        int end = 0;
        
        for(int i : weights){
            
            start = Math.max(i,start);
            
            end+=i;
        }
        
        int maxCapacity = 0;
        
      while(start <= end){
          
          int mid = (end-start)/2 + start;
          
          
          int maxdays = finddays(weights , mid , days);
          
          if( maxdays != -1 &&   maxdays <= days){
              maxCapacity = mid;
              end = mid-1;
          }else{
              
              start = mid+1;
              
          }
          
          
          
      }  
        
        
        return maxCapacity;
        
        
    }
    
    
    public int finddays(int[] weights , int mid ,int days){
        
        int load =0;
        int day1 = 1;
        
        for(int i = 0;i < weights.length; i++){
            
            if(load + weights[i] > mid){
                day1++;
                load = weights[i];
            }else{
                
                load = load+weights[i];
            }
            
            
            
        }
        
        
        
        return day1;
        
        
    }
}