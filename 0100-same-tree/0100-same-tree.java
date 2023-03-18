/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    
    public boolean find(TreeNode p, TreeNode q){
        
        
        if(p == null && q == null){
            return true;
        }
        
         if(p == null || q == null){
            return false;
        }
        
        return (p.val == q.val ) && find(p.left , q.left)  && find(p.right , q.right);
        
        
    }
    
    
    public boolean isSameTree(TreeNode p, TreeNode q) {
        
        return find(p , q);
        
        
    }
}