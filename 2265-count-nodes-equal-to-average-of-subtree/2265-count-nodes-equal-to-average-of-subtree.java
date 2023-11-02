
class Solution {
    
    int count = 0;
    public int averageOfSubtree(TreeNode root) {
        
        
        
        solve(root);
        return count;
    }
    
    public int solve(TreeNode root){
        
        if(root == null){
            return 0;
        }
        
        
        int left  = solve(root.left);
        int right  =solve(root.right);
        
        int leftcount = findcount(root.left);
        int rightcount = findcount(root.right);
        
      int value = (left + right + root.val)/(leftcount + rightcount + 1);
        
        if(value == root.val){
            count++;
        }
        
        
        return left + right + root.val;
        
    }
    
    public int  findcount(TreeNode root){
        
        if(root == null){
            
            return 0;
        }
        
        
        
        int left = findcount(root.left);
        
        int right = findcount(root.right);
        
        return 1 + left + right;
        
        
    }
    
}