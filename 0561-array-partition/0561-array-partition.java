class Solution {
    public int arrayPairSum(int[] nums) {
        
    int n = nums.length;
        
        Arrays.sort(nums);
        
        int sum = 0;
        
       int i = nums.length-1;
        while(i > 0){
            
          int a = Math.min(nums[i] , nums[i-1]);
            sum+=a;
            i = i-2;
        }
        
        return sum;
    }
}