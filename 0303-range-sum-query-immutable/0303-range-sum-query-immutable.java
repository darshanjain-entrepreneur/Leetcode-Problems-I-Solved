class NumArray {

    
    int arr[];
    int prefix[];
    public NumArray(int[] nums) {
        
        int n = nums.length;
        arr = new int[n];
        prefix = new int[n];
        for(int i = 0;  i< n; i++){
            
            arr[i] = nums[i];
            
            if(i == 0){
                prefix[i] = arr[i];
            }else{
                prefix[i] = arr[i]+prefix[i-1];
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