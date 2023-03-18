
class Solution {
    
    boolean ans = false;
    
    public boolean match(TreeNode root , TreeNode subRoot){
        
        if(root != null && subRoot != null){
            
            boolean a = match(root.left , subRoot.left);
            boolean b = match(root.right , subRoot.right);
            
            if(root.val == subRoot.val && a && b){
                return true;
            }
            
            
            
        }else if(root == null && subRoot == null){
            return true;
        }
        
        
        return false;
        
        
    }
    
    
    
    
    
    
    
    
    public void find(TreeNode root , TreeNode subRoot){
        
        if(root == null){
            return;
        }
        
        find(root.left , subRoot);
        boolean x  = match(root , subRoot);
        if(x){
            ans = x;
        }
        
        find(root.right , subRoot);
        
    }
    
    
    
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        
        find(root , subRoot);
        
        return ans;
        
    }
}