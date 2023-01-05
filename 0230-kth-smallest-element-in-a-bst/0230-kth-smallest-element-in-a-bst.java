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
    
    public void find(TreeNode root , PriorityQueue<Integer> p , int k){
        if(root == null){
            return;
        }
        
        p.add(root.val);
        
        find(root.left , p , k);
        find(root.right , p , k);
        
        
    }
    
    public int kthSmallest(TreeNode root, int k) {
        if(root == null){
            return -1;
        }
        
        
        PriorityQueue<Integer> p = new PriorityQueue<>();
        
        find( root , p , k);
        
    if(p.size() < k){
        return -1;
    }
       
        
        int i = 0;
        int ans = 0;
        while(i < k){
         
            ans = p.poll();
            i++;
        }
        return ans;
    }
}