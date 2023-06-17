
class Solution {
    
    TreeNode cur = new TreeNode(0);
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        
     return find(root1 , root2);
     
    }
    
    public TreeNode  find(TreeNode root1 , TreeNode root2){
        
      if(root1 == null && root2 ==null){
          return null;
      }
        
        if(root1 == null){
            return root2;
        }
        if(root2 == null){
            return root1;
        }
        
        
        
        
        TreeNode cur = new TreeNode(root1.val + root2.val);
        
        cur.left = find(root1.left , root2.left);
        cur.right = find(root1.right , root2.right);
        
        return cur;
        
        
    }
}