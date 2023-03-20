
class Solution {
    
    
    public boolean find(TreeNode left , TreeNode right){
        
        if(left == null && right == null){
            return true;
        }
        
        if(left == null || right == null){
            return false;
        }
        
        return left.val == right.val && find(left.left , right.right) && find(left.right , right.left);
        
        
        
    }
    
    
    
    
    
    public boolean isSymmetric(TreeNode root) {
        
        if(root == null){
            return true;
        }
        
        return find(root.left , root.right);
    }
}