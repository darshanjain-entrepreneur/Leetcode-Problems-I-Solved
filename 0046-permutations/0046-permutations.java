class Solution {
    public List<List<Integer>> permute(int[] nums) {
        
        
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        boolean freq[] = new boolean[nums.length];
        
        permutation(ans , subset , freq ,nums);
        return ans;
        
        
    }
    public void permutation(List<List<Integer>> ans , List<Integer> subset , boolean freq[] ,  int[] nums){
        if(subset.size() == nums.length){
            
            ans.add(new ArrayList<>(subset));
            return;
            
            
            
        }
        
        
        for(int i = 0; i < nums.length; i++ ){
            
            if(freq[i] == false){
                freq[i] = true;
                subset.add(nums[i]);
                permutation(ans , subset , freq , nums);
                subset.remove(subset.size() - 1);
                freq[i] = false;
                
                
            }
            
            
            
        }
        
        
        
        
        
        
        
        
        
    }
}