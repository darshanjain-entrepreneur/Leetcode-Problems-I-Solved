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
    
    public void find(List<Integer> l , TreeNode root){
        if(root == null){
            return;
        }
        
        find(l , root.left);
        l.add(root.val);
        find(l , root.right);
        
        
    }
    
    public List<Integer> inorderTraversal(TreeNode root) {
        
        List<Integer> l = new ArrayList<>();
        
        find(l , root);
        return l;
        
        
    }
}