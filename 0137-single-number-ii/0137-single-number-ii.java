class Solution {
    public int singleNumber(int[] nums) {
        
        
        //best approach;
        int ones = 0;
        int two = 0;
        
        for(int i : nums){
            
            ones = (ones^i)&(~two);
            two = (two^i)&(~ones);
            
        }
        return ones;
    }
}