
class Solution {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        
        
        
   return find(nums , 0 , nums.length-1);
        
        
        
        
    }
    
    public TreeNode find(int nums[] , int start, int end){
        
       if(start > end){
           
           return null;
       }
        
        
        
        int index = findmax(nums , start , end);
        TreeNode temp = new TreeNode(nums[index]);
        temp.left = find(nums , start , index-1 );
        temp.right = find(nums , index+1 , end);
        
        return temp;
        
    }
    
    public int findmax(int nums[] , int start , int end){
        
       int max = -1;
        int index = -1;
        for(int i = start; i <= end; i++){
            
            if(nums[i] > max){
                
                max = nums[i];
                index = i;
            }
            
        }
        
        return index;
    }
    
    
}