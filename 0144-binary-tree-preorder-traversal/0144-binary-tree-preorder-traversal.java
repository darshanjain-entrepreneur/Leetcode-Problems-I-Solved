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
    public List<Integer> preorderTraversal(TreeNode root) {
        Stack<TreeNode> s = new Stack<>();
        List<Integer> ans = new ArrayList<>();
        if(root == null){
            return ans;
        }
        
        s.add(root);
        
        while(!s.isEmpty()){
            TreeNode sol = s.pop();
            ans.add(sol.val);
            if(sol.right != null){
                s.add(sol.right);
            }
            
            if(sol.left != null){
                s.add(sol.left);
            }
            
        }
        
        
      return ans;  
        
        
    }
}