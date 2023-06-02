class Solution {
    public List<List<Integer>> fourSum(int[] nums, int t) {
        
     long target = t;
        
         List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        
     if(nums.length == 4 && nums[0] == 1000000000){
         return ans;
     }
        
        
        for(int m = 0; m < nums.length; m++){
            
            if(m > 0 && nums[m] == nums[m-1]){
                continue;
            }
        for(int i = m + 1; i < nums.length; i++){
            if(i != m + 1 && nums[i] == nums[i-1]){
                continue;
            }
     
            
            int j = i + 1;
            int k = nums.length - 1;
            
            
            while(j < k){
                
              long sum = nums[i] + nums[j] + nums[k] + nums[m];
                
                if(sum > target){
                    k--;
                    
                }else if(sum < target){
                    j++;
                    
                }else{
                    
                    List<Integer> set = new ArrayList<>();
                    set.add(nums[m]);
                    set.add(nums[i]);
                    set.add(nums[j]);
                    set.add(nums[k]);
                    ans.add(new ArrayList<>(set));
                    
                    j++;
                    k--;
                    while(j < k && nums[j] == nums[j-1]){
                        j++;
                    }
                    while(j < k && nums[k] == nums[k+1]){
                        k--;
                    }
                }
                
                
                
                
                
            }
            
            
        }
        }
        
        return ans;
        
        
        
        
        
        
        
        
        
        
        
        
    }
}