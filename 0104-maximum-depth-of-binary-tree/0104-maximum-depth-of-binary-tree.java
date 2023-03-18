
class Solution {
    
    public int maxheight(TreeNode root){
        
        if(root == null){
            
            return 0;
        }
        
        int left = maxheight(root.left);
        
        int right = maxheight(root.right);
        
        return 1 + Math.max(left , right);
        
        
        
    }
    
    
    
    public int maxDepth(TreeNode root) {
        
        int ans = maxheight(root);
        return ans;
        
    }
}