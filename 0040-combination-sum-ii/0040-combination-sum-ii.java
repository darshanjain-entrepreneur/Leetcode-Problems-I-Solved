class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        
        List<Integer> result = new ArrayList<>();
        
        finding(0 , candidates , target , result , ans);
        
        return ans;
        
        
    }
    
    public void finding(int index , int[] nums , int target , List<Integer> result ,List<List<Integer>> ans ){
        
        if(target == 0){
            ans.add(new ArrayList<>(result));
            return;
        }
        
        
        for(int i = index; i < nums.length; i++){
            
            if(i > index && nums[i] == nums[i-1]){
                continue;
            }
            
            if(nums[i] > target){
                break;
            }
            
            result.add(nums[i]);
            finding(i + 1 , nums , target - nums[i] , result , ans);
            result.remove(result.size() - 1);
            
            
        }
        
        
        
    }
    
    
}