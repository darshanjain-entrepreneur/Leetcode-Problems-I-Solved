class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        
    HashMap<Integer ,ArrayList<Integer>> map = new HashMap<>();
        
        
   int ans[] = new int[2];
        
        for(int i = 0; i < nums.length; i++){
           
            
            if(!map.containsKey(nums[i])){
                 map.put(nums[i] , new ArrayList<Integer>());
            }
            map.get(nums[i]).add(i);
            
        }
        
    
        for(int i : nums){
            
            if(map.containsKey(target -i)){
                
                if(i != target-i){
                    
                    ans[0] = map.get(i).get(0)+1;
                    ans[1] = map.get(target-i).get(0)+1;
                    break;
                }else{
                    
                    ans[0] = map.get(i).get(0)+1;
                    ans[1] = map.get(i).get(1)+1;
                    break;
                    
                }
            }
            
        }
        
        
        return ans;
        
        
    }
}