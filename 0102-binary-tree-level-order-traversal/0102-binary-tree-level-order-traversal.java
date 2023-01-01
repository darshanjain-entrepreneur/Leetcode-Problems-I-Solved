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
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        List<List<Integer>> ans = new LinkedList<>();
        if(root == null){
            return ans;
        }
        
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        
        while(!q.isEmpty()){
            
            int sizes = q.size();
            List<Integer> solve = new LinkedList<>();
            
            for(int i = 0 ; i  < sizes; i++){
                
                TreeNode hello = q.poll();
                if(hello.left != null){
                    q.add(hello.left);
                }
                
                if(hello.right != null){
                    q.add(hello.right);
                }
                
                solve.add(hello.val);
            }
            
            
            ans.add(solve);
            
            
        }
        
        
        return ans;
        
        
    }
}