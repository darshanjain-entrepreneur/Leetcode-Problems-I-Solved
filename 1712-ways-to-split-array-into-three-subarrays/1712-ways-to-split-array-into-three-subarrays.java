class Solution {
    public int waysToSplit(int[] nums) {
        
        
        int n = nums.length;
        
        int prefix[] = new int[nums.length];
        long count = 0;
        
        int mod = (int)(1e9) + 7;
        
        for(int i = 0; i < nums.length; i++){
            
       
            if(i == 0){
                
                prefix[i] = nums[i];
            }else{
                
                prefix[i] = prefix[i-1] + nums[i];
            }
            
            
            
        }
        
        
        
        for(int i = 0; i < n; i++){
            
            
            int index1 = solve1(i+1 , n-2 , prefix , prefix[i] , i);
            int index2 = solve2(i+1 , n-2 , prefix , prefix[i] , i);
            
        
            
          if(index1 > i){
                count = count  +  (long)(index2 - index1+1);
          }
            
        }
        
        
 
        return (int)(count%mod);
    }
    
    
    public int solve1(int start , int end , int prefix[] , int value , int i){
        
        int index = start-1;
        int n = prefix.length;
        
        while(start <= end){
            
            
            int mid = (start+end)/2;
            
        int val1 = prefix[mid] - prefix[i];
            int val2 = prefix[n-1] - prefix[mid];
            
            if(val1  < value){
                start  = mid+1;
            }else if(val2 < val1){
                
                end = mid-1;
            }else{
                
                index = mid;
                end = mid-1;
            }
            
            
        }
        
        
        return index;
    }
    
    
      public int solve2(int start , int end , int prefix[] , int value , int i){
        
        int index = start-1;
        int n = prefix.length;
        while(start <= end){
            
            
            int mid = (start+end)/2;
            
        int val1 = prefix[mid] - prefix[i];
            int val2 = prefix[n-1] - prefix[mid];
            
            if(val1  < value){
                start  = mid+1;
            }else if(val2 < val1){
                
                end = mid-1;
            }else{
                
                index = mid;
                start = mid+1;
            }
            
            
        }
        
        
        return index;
    }
    
    
   
}