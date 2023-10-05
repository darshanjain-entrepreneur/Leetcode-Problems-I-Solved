class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        
Arrays.sort(nums);
        List<Integer> ans = new ArrayList<>();
        
        
        int n = nums.length/3;
        int count = 1;
        if(n == 0){
            ans.add(nums[0]);
        }
        
        for(int i = 1; i < nums.length; i++){
            
            if(nums[i] == nums[i-1]){
                count++;
               if(ans.size() == 0 && count > n){
                   ans.add(nums[i]);
               }else if(ans.size() > 0 && ans.get(ans.size()-1) != nums[i] && count > n){
                   ans.add(nums[i]);
               }
                
            }else{
                
                count = 1;
                  if(ans.size() == 0 && count > n){
                   ans.add(nums[i]);
               }else if(ans.size() > 0 && ans.get(ans.size()-1) != nums[i] && count > n){
                   ans.add(nums[i]);
               }
                
            }
            
            
            
        }
        
        
        return ans;
    }
}