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
    
    public boolean findi(TreeNode head1 , TreeNode head2){
       if(head1 == null && head2 == null){
           return true;
       }
        if(head1 == null || head2 == null){
            return false;
        }
        
        
        return head1.val == head2.val && findi(head1.left , head2.right) && findi(head1.right , head2.left );
        
        
        
    }
    
    
    
    public boolean isSymmetric(TreeNode root) {
        TreeNode head1 = root;
        TreeNode head2 = root;
        
        boolean sol =  findi(head1 , head2 );
        return sol;
        
    }
}