
class Solution {
    StringBuilder bb = new StringBuilder();
    public String tree2str(TreeNode root) {
        
        solve(root);
        
        return bb.toString();
    }
    
    public void solve(TreeNode root){
        
        
        if(root == null){
            return;
        }
        
        
        bb.append(root.val);
        
        if(root.left == null && root.right == null){
            return;
        }
        
        bb.append("(");
        solve(root.left);
        bb.append(")");
        
        
        if(root.right != null){
            
        bb.append("(");
            solve(root.right);
            bb.append(")");
            
        }
        
            
  
    }
}