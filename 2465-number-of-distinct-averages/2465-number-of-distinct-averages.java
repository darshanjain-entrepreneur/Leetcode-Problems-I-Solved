class Solution {
    public int distinctAverages(int[] nums) {
        
        HashSet<Float> set = new HashSet<>();
        
        
        
        Arrays.sort(nums);
        
        int start = 0;
        int end = nums.length-1;
        
        while(start < end){
            
            
            float a = (float)(nums[start] + nums[end])/(float)2;
            
            set.add(a);
            
            start++;
            end--;
            
            
            
            
            
            
        }
        
        return set.size();
        
    }
}