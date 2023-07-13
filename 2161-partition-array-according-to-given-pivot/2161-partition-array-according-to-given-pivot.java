class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        if(nums.length == 1){
            return new int[]{nums[0]};
        }
        
        ArrayList<Integer> small  = new ArrayList<>();
        ArrayList<Integer> big = new ArrayList<>();
        ArrayList<Integer> equal = new ArrayList<>();
        
        
        for(int i : nums){
            
            if(i == pivot){
                equal.add(i);
            }else if(i > pivot){
                
                big.add(i);
            }else{
                
                small.add(i);
            }
            
            
            
            
            
        }
        
        int ans[] = new int[nums.length];
        int k = 0;
       for(int i = 0; i < small.size(); i++){
           ans[k] = small.get(i);
           k++;
       }
        
         for(int i = 0; i < equal.size(); i++){
           ans[k] = equal.get(i);
           k++;
       }
        
        
         for(int i = 0; i <big.size(); i++){
           ans[k] = big.get(i);
           k++;
       }
        
        
        
       return ans; 
        
        
    }
}