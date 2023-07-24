class Solution {
    
 HashMap<Integer, ArrayList<Integer>> ll = new HashMap<>();

    public Solution(int[] nums) {
        
      for(int i = 0;i < nums.length; i++){
          
          if(ll.containsKey(nums[i])){
              ll.get(nums[i]).add(i);
          }else{
              
              ll.put(nums[i] , new ArrayList<>());
              ll.get(nums[i]).add(i);
          }
          
      }
        
        
    }
    
    public int pick(int target) {
     int index = (int)(Math.random()*(ll.get(target).size()));
        
        return ll.get(target).get(index);
    }
     
}

