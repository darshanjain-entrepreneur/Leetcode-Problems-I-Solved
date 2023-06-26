class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        
        int count = 0;
        HashMap<Integer ,Integer> map = new HashMap<>();
        
        for(int i = 0; i < nums1.length; i++){
            
            map.put(nums1[i] ,map.getOrDefault(nums1[i] , 0) + 1);
            
            
            
            
            
        }
        int ans = (int)1e9;
        
        for(int i = 0; i < nums2.length; i++){
            
            if(map.containsKey(nums2[i])){
                ans = Math.min(ans , nums2[i]);
          count++;
            }
        }
        
        if(count == 0){
            return -1;
        }
        
        
     return ans;
    }
}