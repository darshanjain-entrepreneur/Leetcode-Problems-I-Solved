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
            
            int levelsize = queue.size();
            List<Integer> wrap = new ArrayList<>();
            int arr[] = new int[levelsize];
              List<Integer> result = new ArrayList<>();
            
            for(int i = 0; i < levelsize; i++){
                
               TreeNode node = queue.poll();
                if(flag){
                    arr[i] = node.val;
                }else{
                    
                    arr[levelsize - 1 -i] = node.val;
                    
                }
                
                if(node.left != null){
                    queue.add(node.left);
                }
                
                if(node.right != null){
                    queue.add(node.right);
                }
                
                
                
            }
            
            flag = !flag;
            for(int i = 0; i< arr.length; i++){
                
                result.add(arr[i]);
            }
            
            ans.add(result);
            
        }
            
            
            
       
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        return ans;
        
        
        
        
        
    }
}