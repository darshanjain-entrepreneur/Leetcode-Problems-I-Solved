class Solution {
    public int maximumCount(int[] nums) {
        
        System.out.println(nums.length);
        int pos = 0;
        int neg = 0;
        
        
        int start = 0;
        int count = 0;
        int end = nums.length-1;
        
        while(start <= end){
            
            int mid = start + (end-start)/2;
            
            if(nums[mid] > 0 && mid-1 >= 0 && nums[mid-1] <= 0){
                
                pos = mid;
                count=1;
                break;
                
                
            }else{
                
                if(nums[mid] <= 0){
                    start = mid+1;
                }else{
                    end = mid-1;
                    
                }
                
                
            }
            
            
            
        }
        
     if(count == 0){
         
         pos = start;
       
     }
        
        count = 0;
        
        start = 0;
        end = nums.length-1;
        
            while(start <= end){
            
            int mid = start + (end-start)/2;
            
            if(nums[mid] < 0 && mid+1 < nums.length && nums[mid+1] >= 0){
                
                neg = mid;
                count=1;
                break;
                
                
            }else{
                
                if(nums[mid] >= 0){
                    end = mid-1;
                }else{
                  start = mid+1;
                    
                }
                
                
            }
            
            
            
        }
        
        if(count == 0){
            
           neg =end;
            
        }
        
        
        return Math.max(nums.length-pos , neg+1);
        
        
    }
}