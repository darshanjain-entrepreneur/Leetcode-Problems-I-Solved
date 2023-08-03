
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        
        
        return find(0 , nums.length-1 , nums);
        
        
    }
    public TreeNode find(int start , int end , int nums[]){
        
        if(start > end){
            return null;
        }
        
        int mid = start + (end-start)/2;
        
        TreeNode root = new TreeNode(nums[mid]);
        
        root.left = find(start , mid-1 , nums);
        
        root.right = find(mid+1 , end , nums);
        
        return root;
        
        
        
        
        
        
    }
}