class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        
        int n = nums.length;
        int i = 0;
        
        while(i < n){
            
            int currindex = nums[i] - 1;
            
            if(nums[currindex] != nums[i]){
                
                int temp = nums[currindex];
                nums[currindex] = nums[i];
                nums[i]= temp;
                
                
            }else{
                
                
                i++;
                
                
            }
            
            
        }
            
            List<Integer> ll = new ArrayList<>();
        
            
        for(int j = 0; j < n; j++){
            
           if(nums[j] != j + 1){
               
               ll.add(nums[j]);
           }
        }
        
        
        return ll;
        
    }
}