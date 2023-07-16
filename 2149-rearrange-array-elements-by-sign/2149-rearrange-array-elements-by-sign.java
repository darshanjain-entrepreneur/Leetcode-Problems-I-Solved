class Solution {
    public int[] rearrangeArray(int[] nums) {
        
        
        int arr1[] = new int[nums.length/2];
        int arr2[] = new int[nums.length/2];
        int x = 0;
        int y= 0;
        
        for(int i : nums){
            
            if(i > 0){
                arr1[x] = i;
                x++;
            }else{
                
                arr2[y] = i;
                y++;
            }
            
            
        }
        
        
        
       int i = 0;
        int j = 0;
        int k = 0;
        int prev = -4;
        
        while(i < nums.length ){
            
            if(prev < 0){
                
                nums[i] = arr1[j];
                j++;
                prev = 4;
                i++;
            }else{
                nums[i] = arr2[k];
                k++;
                i++;
                prev = -4;
                
            }
            
            
            
            
            
        }
        
        
        
        
        return nums;
        
        
    }
}