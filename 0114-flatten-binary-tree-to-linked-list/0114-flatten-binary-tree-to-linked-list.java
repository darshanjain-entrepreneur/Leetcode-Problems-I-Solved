
class Solution {
    TreeNode prev = null;
    public void flatten(TreeNode root) {
        
        TreeNode prev = null;
        
        find(root );
    }
    
    public void find(TreeNode root){
        
        if(root == null){
            return;
        }
        
        find(root.right);
        find(root.left);
        
        root.right = prev;
        root.left = null;
        
        prev = root;
        
        
        
        
    }
}