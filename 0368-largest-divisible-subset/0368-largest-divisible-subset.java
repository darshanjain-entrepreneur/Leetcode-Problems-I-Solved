class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        
        int dp[] = new int[nums.length];
        int hash[] = new int[nums.length];
        int maxi = -1;
        int largestindex = -1;
        Arrays.sort(nums);
        
        for(int i = 0; i < nums.length; i++){
            hash[i] = i;
            for(int prev = 0; prev < i; prev++){
                
                if(nums[i] % nums[prev] == 0 && 1 + dp[prev] > dp[i] ){
                    
                    dp[i] = 1 + dp[prev];
                    hash[i] = prev;
                }
                
                
            }
            
            if(dp[i] > maxi){
                maxi = dp[i];
                largestindex = i;
                
                
            }
        }
        
        int i = largestindex;
        List<Integer> ans = new ArrayList<>();
        ans.add(nums[i]);
        
        while(hash[i] != i){
             i = hash[i];
            ans.add(nums[i]);
           
        }
        return ans;
        
    }
}