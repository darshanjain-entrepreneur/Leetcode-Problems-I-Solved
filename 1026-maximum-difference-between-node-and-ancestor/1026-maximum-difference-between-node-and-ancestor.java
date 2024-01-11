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
      public int maxAncestorDiff(TreeNode root) {
        
        
        return find(root , root.val , root.val);
    }
    
    
    public int find(TreeNode root , int max , int min){
        
        if(root == null){
            
            return Math.abs(max - min);
        }
        
        
        max = Math.max(max , root.val);
        min = Math.min(min , root.val);
        
        int left = find(root.left , max , min);
        int right = find(root.right , max , min);
        
        return Math.max(left , right);
        
        
    }
}