class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        
        HashMap<Integer , Integer> map = new HashMap<>();
        
        
        
        for(int i = 0; i < nums.length; i++){
            
            
            
            map.put(nums[i] , i);
          
        }
        
        
        
        int count = 0;
        
        for(int i = 0; i < nums.length-2; i++){
            
            int first = nums[i] + diff;
            int second = first + diff;
            
            if(map.containsKey(first) && map.containsKey(second)){
                
                if(map.get(first) > i && map.get(second) > map.get(first)){
                    
                    count++;
                }
                
                
            }
            
            
            
        }
        
        
        
        return count;
        
    }
}