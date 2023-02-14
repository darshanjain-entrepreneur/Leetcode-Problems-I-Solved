class Solution {
    public int findPairs(int[] nums, int k) {
        
        HashMap<Integer , Integer> map = new HashMap<>();
        int count = 0;
        Arrays.sort(nums);
        
        
        for(int i = 0; i < nums.length; i++){
            
            
                
                if(!map.containsKey(nums[i])){
                    map.put(nums[i] , 1);
                
                    int start = i + 1;
                    int end = nums.length - 1;
                    int mid = 0;
                    while(start <= end){
                        mid = start + (end - start)/2;
                        if(nums[mid] == k + nums[i]){
                            count++;
                            break;
                        }else{
                            if(nums[mid] > nums[i] + k){
                                end = mid - 1;
                                
                            }else{
                                start = mid + 1;
                            }
                        }
                    }
                    
                    
                    
                }
                
                
            
            
            
            
            
            
        }
        return count;
        
    }
}