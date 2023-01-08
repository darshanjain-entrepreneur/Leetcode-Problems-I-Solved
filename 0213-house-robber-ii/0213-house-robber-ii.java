class Solution {
    
    public int find(ArrayList<Integer> ans){
        int n = ans.size();
        
        int prev = ans.get(0);
        int temp = 0;
        int anss = 0;
        
        for(int i = 1; i < n; i++){
            
            int notpick = prev;
            
            int pick = ans.get(i);
            if(i > 1){
                pick = ans.get(i) + temp;
            }
            
            anss = Math.max(notpick , pick);
            temp = prev;
            prev = anss;
            
        }
        
      return prev;  
        
        
        
    }
    
    
    
    
    public int rob(int[] nums) {
        int m = nums.length;
        if(m == 0){
            return 0;
        }
        
        if(m == 1){
            return nums[0];
        }
        if(m == 2){
            return Math.max(nums[0] , nums[1]);
        }
        
        
        ArrayList<Integer> nums1 = new ArrayList<>();
        ArrayList<Integer> nums2 = new ArrayList<>();
        
        for(int i = 0 ; i < m; i++){
            
            if(i != 0){
                nums1.add(nums[i]);
            }
            if(i != m-1){
                nums2.add(nums[i]);
            }
            
        }
        
        int ans1 = find(nums1);
        int ans2 = find(nums2);
        return Math.max(ans1 , ans2);
        
        
    }
}