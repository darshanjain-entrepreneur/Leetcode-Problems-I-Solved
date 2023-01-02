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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        List<List<Integer>> ans = new ArrayList<>();
        
        
        if(root == null){
            return ans;
        }
        
        Queue<TreeNode> queue = new LinkedList<>();
        
        queue.add(root);
        boolean flag = true;
        
        while(!queue.isEmpty()){
            
            int sizes = queue.size();
            List<Integer> result = new ArrayList<>();
            int arr[] = new int[sizes];
            
            for(int i = 0 ; i < sizes; i++){
                
                TreeNode sol = queue.poll();
                if(flag){
                    
                    arr[i] = sol.val;
                    
                }
                if(!flag){
                    
                    arr[sizes - 1 - i] = sol.val;
                    
                }
                
                if(sol.left != null){
                    queue.add(sol.left);
                }
                if(sol.right != null){
                    queue.add(sol.right);
                }
                
            }
            
            flag = !flag;
          for(int i = 0 ; i < sizes; i++){
              result.add(arr[i]);
              
          }
            
            ans.add(result);
            
        }
        
        
        
        
        
        return ans;
        
        
        
        
        
        
        
    }
}