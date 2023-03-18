
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        List<List<Integer>> ans = new ArrayList<>();
        
        if(root == null){
            return ans;
        }
        
        Queue<TreeNode> queue = new LinkedList<>();
        
        queue.add(root);
        
        while(!queue.isEmpty()){
            
            int levelsize = queue.size();
            List<Integer> wrap = new ArrayList<>();
            
            for(int i = 0; i < levelsize; i++){
                
                if(queue.peek().left != null){
                    queue.add(queue.peek().left);
                }
                if(queue.peek().right != null){
                    queue.add(queue.peek().right);
                }
                
                wrap.add(queue.poll().val);
                
            }
            
            ans.add(wrap);
            
        }
        
        
        
        
        
        
        
        
        return ans;
        
        
        
        
    }
}