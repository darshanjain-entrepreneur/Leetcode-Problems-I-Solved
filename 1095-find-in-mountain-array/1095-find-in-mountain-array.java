/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
 
class Solution {
    
    
    public int findpeak(MountainArray mountainArr){
        
        int start = 0;
        int end = mountainArr.length() - 1;
        while(start < end){
            
            int mid = (start + end)/2;
            if(mountainArr.get(mid) < mountainArr.get(mid + 1)){
                
                start = mid + 1;
            }else{
                end = mid;
            }
          
            
        }
        
        
        return start;
        
    }
    
   
    
    public int binary(int start , int end ,MountainArray nums , int target ){
        
        boolean is = nums.get(start) < nums.get(end);
        
        while(start <= end){
            
            int mid = (end - start)/2 + start;
            if(nums.get(mid) == target){
                return mid;
            }
            
            if(is){
                
                if(nums.get(mid) < target){
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
                
                
                
                
            }else{
                
                if(nums.get(mid) < target){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
                
            }
            
            
        }
        
        
        return -1;
        
    }
    
    
  
    
    
    public int findInMountainArray(int target, MountainArray mountainArr) {
        
        // finding peak index
        
        int peakindex = findpeak(  mountainArr);
        
        // checking for target
        int left = binary(0 , peakindex , mountainArr , target);
        if(left != -1){
            return left;
        }else{
            
            return  binary(peakindex , mountainArr.length() - 1 , mountainArr ,  target);
        }
      
 
        
        
        
    }
}