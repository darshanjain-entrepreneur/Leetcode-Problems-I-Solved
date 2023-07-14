class Solution {
    public int[] singleNumber(int[] nums) {
        
        
       int res = 0;
        for(int i : nums){
            
            res = res^i;
        }
        
       int mask = res &((-1)*(res));
        int first = 0;
        
        for(int i : nums){
            
            if((mask & i) != 0){
                first = first^i;
            }
            
        }
       int second = res^first;
        return new int[]{first , second};
        
        
    }
}