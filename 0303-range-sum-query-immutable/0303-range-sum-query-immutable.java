class NumArray {

    

    int prefix[];
    public NumArray(int[] nums) {
        
        int n = nums.length;
    
        prefix = new int[n];
        for(int i = 0;  i< n; i++){
            
        
            
            if(i == 0){
                prefix[i] = nums[i];
            }else{
                prefix[i] = nums[i]+prefix[i-1];
            }
            
            
        }
        
        
        
        

        
    }
    
    public int sumRange(int left, int right) {
        
     
        if(left == 0){
            return prefix[right];
        }
        
        return prefix[right] - prefix[left-1];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */