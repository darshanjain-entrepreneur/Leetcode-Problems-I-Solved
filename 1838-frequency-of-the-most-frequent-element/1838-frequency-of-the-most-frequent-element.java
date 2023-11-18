class Solution {
    public int maxFrequency(int[] nums, int k) {
        
        
        Arrays.sort(nums);
        int n = nums.length;
  long  prefix[] = new long[n];
        
        
        for(int i = 0; i < n;i++){
            
            
            if(i == 0){
                prefix[i] = nums[i];
            }else{
                
                prefix[i] = prefix[i-1]+nums[i];
            }
            
            
            
        }
        
        
        int count = 1;
       System.out.println( Arrays.toString(prefix));
        
        for(int i = n-1; i >= 0; i--){
            
        
            
            int ind = find(0 , i-1 , prefix , nums , i , k );
          
 
            if(ind >= (int)(1e9)){
                continue;
            }
            
              long a = prefix[i];
            
          if(ind == 0){
              
          }else{
              a = a - prefix[ind-1];
          }
            
            long b = (long)(i-ind+1)*(long)(nums[i]);
            
            
            long c = b-a;
            
       
            
            if(c <= k){
                count = Math.max(count , i - ind+1);
            }
            
            
            
        }
        
        return count;
        
        
    }
    
    
    public int find(int start , int end , long prefix[] , int  nums[] , int  i , int k){
        
        
        
        int ind = (int)(1e9);
        
        
        while(start <= end){
            
            
            int mid = (end-start)/2 + start;
            
            long a = prefix[i];
            
          if(mid == 0){
              
          }else{
              a = a - prefix[mid-1];
          }
            
            long b = (long)(i-mid+1)*(long)(nums[i]);
            
            
            long c = b-a;
            if(c <= k){
                
                ind = Math.min(ind , mid);
                end = mid-1;
            }else{
                
                
                start = mid+1;
                
            }
            
            
        }
        
        
        return ind;
        
    }
    
}