class Solution {
    
    
  
    
    
    
 public List<List<Integer>> subsetsWithDup(int[] nums) {
        
        
          List<List<Integer>> result = new ArrayList<>();
     Arrays.sort(nums);
     
    backtracking(0 , nums , new ArrayList<Integer>() , result);
     
     return result;
    
        
        
    }
    
    public void backtracking(int i , int nums[] , ArrayList<Integer> ll ,  List<List<Integer>> result){
        
      if(i == nums.length){
          
          if(!result.contains(ll)){
              
              result.add(new ArrayList<Integer>(ll));
          }
          
          return;
      }
        
        ll.add(nums[i]);
        
        backtracking(i +1 ,nums ,ll , result);
        
        ll.remove(ll.size() - 1);
        
        backtracking(i + 1 , nums , ll , result);
        
        
        
    }
    
    
    
    
}