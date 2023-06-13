class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        
        for(int row[] : image){
            
            reversearray(row);
            
            
            
        }
        
       return image ; 
    }
    
    
    public void reversearray(int nums[]){
        
        int start = 0;
        int end = nums.length -1;
        
        while(start <= end){
            
            if(start == end){
                if(nums[start] == 0){
                    nums[start] = 1;
                }else{
                    nums[start] = 0;
                }
                start++;
                end--;
            }else{
                
                if(nums[start] == 0){
                    nums[start] = 1;
                }else{
                    nums[start] = 0;
                }
                
                 if(nums[end] ==0){
                    nums[end] = 1;
                }else{
                    nums[end] = 0;
                }
                
                     int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
                start++;
                end--;
            
            }
            
            
            
       
            
        }
        
        
        
    }
    
}