class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        
        HashMap<Integer , Integer> map = new HashMap<>();
        int n = nums.length/3;
        
       List<Integer> ans = new ArrayList<>();
        
        for(int i : nums){
            
            map.put(i , map.getOrDefault(i , 0)+1);
        }
        
        for(int i : map.keySet()){
            
            if(map.get(i) > n){
                ans.add(i);
            }
            
        }
        
        return ans;
    }
}