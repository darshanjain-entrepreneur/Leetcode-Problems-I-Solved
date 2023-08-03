
class Solution {
    public boolean isUnivalTree(TreeNode root) {
        
        int prev = -1;
        
        return find(root , prev);
        
        
    }
    
    
    public boolean find(TreeNode root , int prev){
        
        if(root == null){
            return true;
        }
        
        
        if(prev != -1 && root.val != prev){
            
            return false;
        }
        
        
     boolean a = find(root.left , root.val);
        boolean b = find(root.right , root.val);
        
        return a && b;
        
        
    }
}