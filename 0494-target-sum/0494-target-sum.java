class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        
        if(nums.length == 1){
            if(nums[0] == target || nums[0] == -target){
                return 1;
            }else{
                return 0;
            }
        }
        
 
        
      HashMap<Integer , HashMap<Integer , Integer>> map = new HashMap<>();
        
        
       return find(nums.length-1 , target , nums , map); 
        
        
        
        
        
        
    }
    
    public int find(int i , int target ,int nums[] , HashMap<Integer , HashMap<Integer , Integer>> map  ){
        
       if(i == 0){
           
       if(target == 0 && nums[0] == 0){
           
           return 2;
       }else if(target == 0){
           return 0;
       }else if(target - nums[i] == 0 || target + nums[i] == 0){
           return 1;
       }
           
          return 0; 
       }
        
        
       if(map.containsKey(i)){
           
           if(map.get(i).containsKey(target)){
               
               return map.get(i).get(target);
           }
           
           
       }
        
   
        
        
        int positive = find(i-1 , target+nums[i] , nums , map);
        int negative = find(i-1 , target-nums[i] , nums , map);
        
        
       if(!map.containsKey(i)){
           
           map.put(i , new HashMap<Integer , Integer>());
           
           map.get(i).put(target  , positive+negative);
           
       }else{
           
           if(map.get(i).containsKey(target)){
               
               map.get(i).put(target , positive+negative);
               
           }else{
               
               map.get(i).put(target , positive+negative);
           }
           
           
           
       }
           
           
           
        
        return positive+negative;
      
        
        
  
        
        
    }
}