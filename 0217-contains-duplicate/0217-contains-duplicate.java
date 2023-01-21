class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        HashSet<Integer> s = new HashSet<>();
        
        for(int i = 0 ; i < nums.length; i++){
            s.add(nums[i]);
            
        }
        
        if(s.size() == nums.length){
            return false;
        }
        
        return true;
    }
}