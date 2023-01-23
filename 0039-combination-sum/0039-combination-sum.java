class Solution {
    List<List<Integer>> solve = new ArrayList<>();
    
    public void finding(int[] nums , int target , int i , List<Integer> ans ){
        
       if(i == nums.length){
           if(target == 0){
               solve.add(new ArrayList<>(ans));
               return;
           }else{
               return;
           }
       }
           
           
       if(target >= nums[i]){
           ans.add(nums[i]);
           finding(nums , target - nums[i] , i , ans);
           ans.remove(ans.size() - 1);
       }
        
        
        finding(nums , target ,i + 1 , ans);
    
        
        
        
    }
    
    
    
    
    
    
    
    
    
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        List<Integer> ans = new ArrayList<>();
        
        finding(candidates , target , 0 , ans);
        return solve;
        
        
    }
}