class Solution {
    
    
    List<List<Integer>> solve = new ArrayList<>();
    
    
    public void finding(int[] nums , List<Integer> ans ,int i){
        
        if(i >= nums.length){
            solve.add(new ArrayList<Integer>(ans));
            return;
        }
        
        ans.add(nums[i]);
        finding(nums , ans , i + 1);
        ans.remove(ans.size() - 1);
        finding(nums , ans , i+ 1);
        
        
        
    }
    
    
    
    
    public List<List<Integer>> subsets(int[] nums) {
        
        List<Integer> ans = new ArrayList<>();
        
        
        finding(nums ,ans , 0 );
        return solve;
        
    }
}