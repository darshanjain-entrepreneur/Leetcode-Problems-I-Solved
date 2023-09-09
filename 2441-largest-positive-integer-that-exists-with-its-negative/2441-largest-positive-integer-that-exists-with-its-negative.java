class Solution {
    public int findMaxK(int[] nums) {
        
        
        int ans = -1;
        HashMap<Integer , Integer> map = new HashMap<>();
        
        
        
        for(int i : nums){
            
            map.put(i , map.getOrDefault(i , 0) + 1);
            
        }
        
        
         
        for(int i : nums){
            
          if(map.containsKey(-i)){
              if(i < 0){
                  ans = Math.max(ans , -i);
              }else{
                  ans = Math.max(ans , i);
              }
          }
            
        }
         
        
        return ans;
    }
}