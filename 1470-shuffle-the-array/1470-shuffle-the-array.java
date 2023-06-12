class Solution {
    public int[] shuffle(int[] nums, int n) {
        
        
      int ans[] = new int[nums.length];
        
        int k = 0;
        
        int i = 0;
        int j = n;
        int count = 0;
        
        while(i < n && j < nums.length && k < nums.length){
            
            if(count == 0){
                count = 1;
                
                ans[k] = nums[i];
                k++;
                i++;
            }else{
                
                ans[k] = nums[j];
                k++;
                j++;
                
                count = 0;
                
                
            }
            
            
            
            
            
            
        }
        
        
      while(i < n){
          
          ans[k] = nums[i];
          i++;
          k++;
          
      }
        
        while(j < nums.length){
            
             ans[k] = nums[j];
          j++;
          k++;
            
        }
        
        
        return ans;
        
        
    }
}